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
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int id;
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
