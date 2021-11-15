package kz.fizmat.fizmatappbykarzhas.controller;

import kz.fizmat.fizmatappbykarzhas.model.Student;
import kz.fizmat.fizmatappbykarzhas.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@NoArgsConstructor
@AllArgsConstructor
public class StudentController {

    @Autowired
    StudentService service;





    @PostMapping(value = "/student")
    public Student addStudent(@RequestBody Student newStudent){
        return service.addStudent(newStudent);
    }

    @GetMapping(value = "/students")
    public List<Student> getStudents(){
        return service.getStudents();
    }


    @DeleteMapping(value = "/student/{id}")
    public void deleteStudent(@PathVariable int id){
        service.deleteStudent(id);
    }

    @PutMapping(value = "/student")
    public Student updateStudent(@RequestBody Student updatedStudent){
        System.out.println(updatedStudent.toString());
        return service.updateStudent(updatedStudent);
    }


}
