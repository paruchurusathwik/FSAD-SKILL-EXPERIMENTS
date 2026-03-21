package RestfulCRUD.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RestfulCRUD.model.Student;

@RestController
@RequestMapping("/students") //base url for this class
public class StudentController {
	@GetMapping("/{id}")
	public Student getData(@PathVariable int id) { //localhost:8081/students/125
		Student s = new Student();
		s.setId(id);
		s.setName("Sathwik");
		s.setCgpa(9.0);
		s.setDropout(false);
		return s;
	}
	
	@PostMapping("/insert")
	public String insertStudent(@RequestBody Student s) {
		return "Student data added successfully!\n" + "Student ID = " + s.getId() + "\n" + "Student Name = " + s.getName() + "\n" + "Student CGPA = " + s.getCgpa() + "\n" + "Student Dropout Status = " + s.isDropout();
	}
	
	@PutMapping("/update/{id}")
	public String updateStudent(@PathVariable int id, @RequestBody Student s) {
		return "Student Id updated successfully!\n" + "Student ID = " + id + "\n" + "Student Name = " + s.getName() + "\n" + "Student CGPA = " + s.getCgpa() + "\n" + "Student Dropout Status = " + s.isDropout();
	}
	
	@DeleteMapping("/del/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable int id) {
		return ResponseEntity.ok("Student Data deleted successfully! " + id);
	}
}
