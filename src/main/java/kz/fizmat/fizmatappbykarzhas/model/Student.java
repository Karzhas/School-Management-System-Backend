package kz.fizmat.fizmatappbykarzhas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;
    private String name;
    private String surname;
    private String patronymic;
    private String nationality;
    private boolean gender;
    private LocalDate birthDate;
    private String grade;
    private String mom;
    private String dad;
    private String classroomTeacher;
    private Double gpa;
    private String sportAchievements;
    private String achievementsAtTheOlympiads;
    private LocalDate yearOfAdmission;
    private boolean grantPlatnik;
    private boolean largeFamily;
    private boolean freeFromPhysicalEducation;

}
