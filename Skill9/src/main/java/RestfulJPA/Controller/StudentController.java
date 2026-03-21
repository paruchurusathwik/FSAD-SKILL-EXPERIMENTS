package RestfulJPA.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import RestfulJPA.Model.Student;
import RestfulJPA.Repository.StudentRepository;

@RestController
@RequestMapping("/student")

public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    // =======================================================
    // POST STUDENT DETAILS
    // =======================================================
    @PostMapping("/save")
    public ResponseEntity<String> addStudent(@RequestBody Student s) {
        studentRepository.save(s);
        return ResponseEntity.ok("Record inserted successfully!");
    }

    // =======================================================
    // GET STUDENT BY REG
    // =======================================================
    @GetMapping("/{reg}")
    public ResponseEntity<Student> getStudent(@PathVariable int reg) {

        Optional<Student> s = studentRepository.findById(reg);

        if (s.isPresent()) {
            return ResponseEntity.ok(s.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // =======================================================
    // GET ALL STUDENTS
    // =======================================================
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // =======================================================
    // UPDATE STUDENT DATA
    // =======================================================
    @PutMapping("/{reg}")
    public ResponseEntity<String> updateStudent(@PathVariable int reg,
                                                @RequestBody Student s) {

        Optional<Student> existingStudent = studentRepository.findById(reg);

        if (existingStudent.isPresent()) {

            Student updateStudent = existingStudent.get();

            updateStudent.setSname(s.getSname());
            updateStudent.setCgpa(s.getCgpa());
            updateStudent.setDropout(s.isDropout());

            studentRepository.save(updateStudent);

            return ResponseEntity.ok("Record updated successfully!");
        } else {
            return ResponseEntity.ok("Record not available");
        }
    }

    // =======================================================
    // DELETE STUDENT
    // =======================================================
    @DeleteMapping("/{reg}")
    public ResponseEntity<String> deleteStudent(@PathVariable int reg) {

        if (studentRepository.existsById(reg)) {
            studentRepository.deleteById(reg);
            return ResponseEntity.ok("Record deleted successfully!");
        } else {
            return ResponseEntity.ok("Record not available");
        }
    }
}