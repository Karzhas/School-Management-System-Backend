package kz.fizmat.fizmatappbykarzhas.service;

import kz.fizmat.fizmatappbykarzhas.model.Teacher;
import kz.fizmat.fizmatappbykarzhas.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository repository;

    public Teacher addTeacher(Teacher teacher){
        return repository.save(teacher);
    }

    public List<Teacher> getTeachers(){
        return repository.findAll();
    }



    public void deleteData(){
        repository.deleteAll();
    }

    public Teacher updateTeacher(Teacher teacher){
        return repository.save(teacher);
    }

    public void deleteTeacher(int id) {
        repository.deleteById(id);
    }
}
