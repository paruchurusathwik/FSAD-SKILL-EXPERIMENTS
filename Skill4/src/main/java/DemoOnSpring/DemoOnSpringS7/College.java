package DemoOnSpring.DemoOnSpringS7;

public class College {
String cname;
Student stud;
//Default Constructor
College() {
	
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Student getStud() {
	return stud;
}
public void setStud(Student stud) {
	this.stud = stud;
}
@Override
public String toString() {
	return "College name=" + cname + "\n" + "Details of student: " + "\n" + stud  ;
}

}
