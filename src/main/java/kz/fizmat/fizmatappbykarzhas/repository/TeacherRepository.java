package kz.fizmat.fizmatappbykarzhas.repository;

import kz.fizmat.fizmatappbykarzhas.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    Teacher findByNameAndSurname(String name, String surname);
}
