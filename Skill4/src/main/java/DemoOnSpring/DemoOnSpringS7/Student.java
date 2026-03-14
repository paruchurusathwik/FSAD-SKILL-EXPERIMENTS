package DemoOnSpring.DemoOnSpringS7;

public class Student {
int regno;
String sname;
//Default Constructor
Student() {
	
}
//parameterized
public Student(int regno, String sname) {
	super();
	this.regno = regno;
	this.sname = sname;
}

public int getRegno() {
	return regno;
}
public void setRegno(int regno) {
	this.regno = regno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
@Override
public String toString() {
	return "Reg.no=" + regno +  "\n" + "Student name=" + sname;
}

}
