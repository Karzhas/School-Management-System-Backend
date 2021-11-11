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



    @PostMapping(value = "/teacher")
    public Teacher addTeacher(@RequestBody Teacher newTeacher){
        return service.addTeacher(newTeacher);
    }

    @GetMapping(value = "/teachers")
    public List<Teacher> getTeachers(){
        return service.getTeachers();
    }


    @DeleteMapping(value = "/teacher/{id}")
    public void deleteTeacher(@PathVariable int id){
        service.deleteTeacher(id);
    }

    @PutMapping(value = "/teacher")
    public Teacher updateTeacher(@RequestBody Teacher updatedTeacher){
        System.out.println(updatedTeacher.toString());
        return service.updateTeacher(updatedTeacher);
    }


}
