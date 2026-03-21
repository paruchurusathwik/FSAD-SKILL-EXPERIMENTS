package RestfulJPA.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RestfulJPA.Model.Employee;
import RestfulJPA.Repository.EmpRepository;

//To connect to React, 5173 is ViteReact port number
@CrossOrigin(origins="http://localhost:5173")

@RestController
@RequestMapping("/emp")

public class EmpController {
	@Autowired //is used to to inject EmpRepository interface
	EmpRepository empRepository;
	
	//=======================================================================
	                        //POST EMPLOYEE DETAILS
	//=======================================================================
	@PostMapping("/save")
	//ResponseEntity is used to return the String
	public ResponseEntity<String> addEmployee(@RequestBody Employee e) {
		Employee ob = empRepository.save(e); //To save the data in database
		return ResponseEntity.ok("Records inserted successfully!");
	}
	
	//========================================================================
	                          //Get EMPLOYEE BY ID
	//========================================================================
	@GetMapping("/{eid}")
	public ResponseEntity<Employee> getEmployee(@PathVariable int eid) {
		Optional<Employee> e = empRepository.findById(eid);
		if(e.isPresent()) {
			return ResponseEntity.ok(e.get());
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
	
	//=======================================================================
	                          //GET ALL EMPLOYEES
	//=======================================================================
	@GetMapping("/all")
	public List<Employee> getAllEmployees() { 
		return empRepository.findAll();
	}
	
	//======================================================================
	                     //UPDATE EMPLOYEE DATA - PUT
	//======================================================================
	@PutMapping("/{id}")
	public ResponseEntity<String> updateEmployee(@PathVariable int id, @RequestBody Employee e) {
		Optional<Employee> existingEmp = empRepository.findById(id);
		if(existingEmp.isPresent()) {
			//First get the record
			//existingEmp object record is copied to updateEmp
			Employee updateEmp = existingEmp.get();
			updateEmp.setEname(e.getEname());
			empRepository.save(updateEmp);
			return ResponseEntity.ok("Record updated successfully!");
		}
		else {
			return ResponseEntity.ok("Record not available");
		}
	}
	
	//=====================================================================
	                    //DELETE - DELETE EMPLOYEE
	//=====================================================================
	@DeleteMapping("/{eid}")
	public ResponseEntity<String> deleteEmp(@PathVariable int eid) {
		if(empRepository.existsById(eid)) {
			empRepository.deleteById(eid);
			return ResponseEntity.ok("Record deleted successfully!");
		}
		else {
			return ResponseEntity.ok("Record not available");
		}
	}
}
