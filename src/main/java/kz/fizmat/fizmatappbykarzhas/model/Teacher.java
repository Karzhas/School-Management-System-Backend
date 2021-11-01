package kz.fizmat.fizmatappbykarzhas.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

public class Teacher {
    String name;
    String surname;
    String patronymic;
    boolean gender;
    String nationality;

    String birthDate;

    String education;
    String qualification;
    boolean isGraduated;
    String pedagogicalExperience;
    String generalExperience;
    String category;
    String teachesInGrades;
    boolean isFullTimeEmployee;
    String maritalStatus;
    int numberOfChildren;
    String awards;
}
