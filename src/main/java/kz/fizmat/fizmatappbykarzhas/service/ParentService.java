package kz.fizmat.fizmatappbykarzhas.service;

import kz.fizmat.fizmatappbykarzhas.model.Parent;
import kz.fizmat.fizmatappbykarzhas.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentService {

    @Autowired
    ParentRepository repository;

    public Parent addParent(Parent parent){
        return repository.save(parent);
    }

    public List<Parent> getParents(){
        return repository.findAll();
    }



    public void deleteData(){
        repository.deleteAll();
    }

    public Parent updateParent(Parent parent){
        return repository.save(parent);
    }

    public void deleteParent(int id) {
        repository.deleteById(id);
    }


}