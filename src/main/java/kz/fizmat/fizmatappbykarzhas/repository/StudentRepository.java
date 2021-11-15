package kz.fizmat.fizmatappbykarzhas.repository;

import kz.fizmat.fizmatappbykarzhas.model.Student;
import kz.fizmat.fizmatappbykarzhas.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
