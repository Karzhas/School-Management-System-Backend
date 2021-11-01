package kz.fizmat.fizmatappbykarzhas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

    @GetMapping(value = "/test")
    public String testApi(@RequestParam(value = "q") String name){
        String d = name;
        return name;
    }



}
