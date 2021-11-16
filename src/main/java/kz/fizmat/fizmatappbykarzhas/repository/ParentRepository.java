package kz.fizmat.fizmatappbykarzhas.repository;


import kz.fizmat.fizmatappbykarzhas.model.Parent;
import kz.fizmat.fizmatappbykarzhas.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ParentRepository  extends JpaRepository<Parent, Integer> {
}
