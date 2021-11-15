package kz.fizmat.fizmatappbykarzhas.service;

import kz.fizmat.fizmatappbykarzhas.model.Student;
import kz.fizmat.fizmatappbykarzhas.model.Teacher;
import kz.fizmat.fizmatappbykarzhas.repository.StudentRepository;
import kz.fizmat.fizmatappbykarzhas.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public Student addStudent(Student student){
        return repository.save(student);
    }

    public List<Student> getStudents(){
        return repository.findAll();
    }



    public void deleteData(){
        repository.deleteAll();
    }

    public Student updateStudent(Student student){
        return repository.save(student);
    }

    public void deleteStudent(int id) {
        repository.deleteById(id);
    }


}
