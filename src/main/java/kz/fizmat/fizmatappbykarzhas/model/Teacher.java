package kz.fizmat.fizmatappbykarzhas.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    String name;
    String surname;
    String patronymic;
    String gender;
    String nationality;
    String birthDate;
    String education;
    String qualification;
    String isGraduated;
    String pedagogicalExperience;
    String generalExperience;
    String category;
    String teachesInGrades;
    String isFullTimeEmployee;
    String maritalStatus;
    String numberOfChildren;
    String awards;

}
