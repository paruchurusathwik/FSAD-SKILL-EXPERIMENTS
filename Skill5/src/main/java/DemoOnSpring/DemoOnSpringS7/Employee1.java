package DemoOnSpring.DemoOnSpringS7;

import java.util.List;

public class Employee1 {
	int empID;
	String empName;
	double empSalary;
	boolean empActive;
	List<String> empSkills;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public boolean isEmpActive() {
		return empActive;
	}
	public void setEmpActive(boolean empActive) {
		this.empActive = empActive;
	}
	public List<String> getEmpSkills() {
		return empSkills;
	}
	public void setEmpSkills(List<String> empSkills) {
		this.empSkills = empSkills;
	}
	//Create toString method to display the output
	@Override
	public String toString() {
		return "Employee ID=" + empID + "\n" + "Employee Name=" + empName + "\n" + "Employee Salary=" + empSalary + "\n" + "Employee Active="
				+ empActive + "\n" + "Employee Skills=" + empSkills + "\n" ;
	}

}
