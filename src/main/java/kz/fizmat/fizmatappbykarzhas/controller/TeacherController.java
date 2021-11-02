package kz.fizmat.fizmatappbykarzhas.controller;

import kz.fizmat.fizmatappbykarzhas.model.Teacher;
import kz.fizmat.fizmatappbykarzhas.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    TeacherService service;

    @GetMapping(value = "/test")
    public TestPojo testApi(@RequestParam(value = "q", defaultValue = "asdd") String name){
        return new TestPojo(name);
    }

    @PostMapping(value = "/teacher")
    public Teacher addTeacher(@RequestBody Teacher newTeacher){
        return service.addTeacher(newTeacher);
    }

    @GetMapping(value = "/teachers")
    public List<Teacher> getTeachers(){
        return service.getTeachers();
    }


}
