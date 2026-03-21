package RestfulJPA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import RestfulJPA.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}