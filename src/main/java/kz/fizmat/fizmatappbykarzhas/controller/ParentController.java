package kz.fizmat.fizmatappbykarzhas.controller;


import kz.fizmat.fizmatappbykarzhas.model.Parent;
import kz.fizmat.fizmatappbykarzhas.service.ParentService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@NoArgsConstructor
@AllArgsConstructor
public class ParentController {

    @Autowired
    ParentService service;


    @GetMapping(value = "/deleteParents")
    public void deleteAll(){
        service.deleteData();
    }


    @PostMapping(value = "/parent")
    public Parent addParent(@RequestBody Parent newParent){
        return service.addParent(newParent);
    }

    @GetMapping(value = "/parents")
    public List<Parent> getParents(){
        return service.getParents();
    }


    @DeleteMapping(value = "/parent/{id}")
    public void deleteParent(@PathVariable int id){
        service.deleteParent(id);
    }

    @PutMapping(value = "/parent")
    public Parent updateParent(@RequestBody Parent updatedParent){
        System.out.println(updatedParent.toString());
        return service.updateParent(updatedParent);
    }


}
