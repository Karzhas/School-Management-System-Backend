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

    public Teacher findByNameAndSurname(String name, String surname){
        return repository.findByNameAndSurname(name,surname);
    }

    public void deleteData(){
        repository.deleteAll();
    }

    public Teacher updateTeacher(String name, String surname, Teacher teacher){
        Teacher oldTeacher = repository.findByNameAndSurname(name,surname);
        oldTeacher.setName(teacher.getName());
        oldTeacher.setSurname(teacher.getSurname());
        oldTeacher.setPatronymic(teacher.getPatronymic());
        oldTeacher.setGender(teacher.getGender());
        oldTeacher.setNationality(teacher.getNationality());
        oldTeacher.setBirthDate(teacher.getBirthDate());
        oldTeacher.setEducation(teacher.getEducation());
        oldTeacher.setQualification(teacher.getQualification());
        oldTeacher.setIsGraduated(teacher.getIsGraduated());
        oldTeacher.setPedagogicalExperience(teacher.getPedagogicalExperience());
        oldTeacher.setGeneralExperience(teacher.getGeneralExperience());
        oldTeacher.setCategory(teacher.getCategory());
        oldTeacher.setTeachesInGrades(teacher.getTeachesInGrades());
        oldTeacher.setIsFullTimeEmployee(teacher.getIsFullTimeEmployee());
        oldTeacher.setMaritalStatus(teacher.getMaritalStatus());
        oldTeacher.setNumberOfChildren(teacher.getNumberOfChildren());
        oldTeacher.setAwards(teacher.getAwards());
        return repository.save(oldTeacher);

    }

    public void deleteTeacher(String name, String surname) {
        Teacher oldTeacher = repository.findByNameAndSurname(name,surname);
        repository.delete(oldTeacher);
    }
}
