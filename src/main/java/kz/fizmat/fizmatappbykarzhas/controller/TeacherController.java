package kz.fizmat.fizmatappbykarzhas.controller;

import kz.fizmat.fizmatappbykarzhas.model.Teacher;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeacherController {

    @GetMapping(value = "/test")
    public TestPojo testApi(@RequestParam(value = "q", defaultValue = "asdd") String name){
        return new TestPojo(name);
    }

    @PostMapping(value = "/teacher")
    public Teacher addTeacher(@RequestBody Teacher newTeacher){
        System.out.println("!");
        return newTeacher;
    }


}
