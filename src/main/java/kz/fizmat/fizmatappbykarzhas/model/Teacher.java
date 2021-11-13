package kz.fizmat.fizmatappbykarzhas.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private boolean gender;
    private String nationality;
    private LocalDate birthDate;
    private String education;
    private String qualification;
    private LocalDate qualificationDate;
    private boolean isGraduated;
    private Integer pedagogicalExperience;
    private Integer generalExperience;
    private String category;
    private String teachesInGrades;
    private boolean isFullTimeEmployee;
    private String maritalStatus;
    private Integer numberOfChildren;
    private String awards;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", education='" + education + '\'' +
                ", qualification='" + qualification + '\'' +
                ", isGraduated='" + isGraduated + '\'' +
                ", pedagogicalExperience='" + pedagogicalExperience + '\'' +
                ", generalExperience='" + generalExperience + '\'' +
                ", category='" + category + '\'' +
                ", teachesInGrades='" + teachesInGrades + '\'' +
                ", isFullTimeEmployee='" + isFullTimeEmployee + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", numberOfChildren='" + numberOfChildren + '\'' +
                ", awards='" + awards + '\'' +
                '}';
    }
}
