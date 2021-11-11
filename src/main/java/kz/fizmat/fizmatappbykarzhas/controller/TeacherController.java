package kz.fizmat.fizmatappbykarzhas.controller;

import kz.fizmat.fizmatappbykarzhas.model.Teacher;
import kz.fizmat.fizmatappbykarzhas.service.TeacherService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@NoArgsConstructor
@AllArgsConstructor
public class TeacherController {

    @Autowired
    TeacherService service;


    @GetMapping(value = "/del")
    public void deleteAll(){
        service.deleteData();
    }

    @GetMapping(value = "/test")
    public Teacher findByNameAndSurname(@RequestParam(value = "n") String name, @RequestParam(value = "s") String surname){
        return service.findByNameAndSurname(name,surname);
    }

    @PostMapping(value = "/teacher")
    public Teacher addTeacher(@RequestBody Teacher newTeacher){
        return service.addTeacher(newTeacher);
    }

    @GetMapping(value = "/teachers")
    public List<Teacher> getTeachers(){
        return service.getTeachers();
    }

    // delete
    @PutMapping(value = "/teacher")
    public Teacher updateTeacher(@RequestParam(value = "n") String name, @RequestParam(value = "s") String surname, @RequestBody Teacher updatedTeacher){
        System.out.println(updatedTeacher.toString());
        return service.updateTeacher(name, surname, updatedTeacher);
    }

    // delete
    @DeleteMapping(value = "/teacher")
    public void deleteTeacher(@RequestParam(value = "n") String name, @RequestParam(value = "s") String surname){
        System.out.println("DELETING: " + name + " " + surname);
        service.deleteTeacher(name,surname);
    }


    @DeleteMapping(value = "/teacher/{id}")
    public void deleteTeacher2(@PathVariable int id){
        service.deleteTeacher("", "");
    }

    @PutMapping(value = "/teacher")
    public Teacher updateTeacher2(@RequestBody Teacher updatedTeacher){
        System.out.println(updatedTeacher.toString());
        return service.updateTeacher("","", updatedTeacher);
    }


}
