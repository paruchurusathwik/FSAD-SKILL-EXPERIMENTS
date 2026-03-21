package RestfulJPA.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employees")

public class Employee {
	@Id //Id annotation indicates empid is primary key
	int empid;
	String ename;
	double salary;
	boolean empActive;
	//Default constructor
	public Employee() {
		
	}
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isEmpActive() {
		return empActive;
	}
	public void setEmpActive(boolean empActive) {
		this.empActive = empActive;
	}
	
}
