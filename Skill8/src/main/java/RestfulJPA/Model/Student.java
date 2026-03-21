package RestfulJPA.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Students")

public class Student {

    @Id
    int reg;

    String sname;
    double cgpa;
    boolean dropout;

    // Default constructor
    public Student() {
    }

    public int getReg() {
        return reg;
    }

    public void setReg(int reg) {
        this.reg = reg;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public boolean isDropout() {
        return dropout;
    }

    public void setDropout(boolean dropout) {
        this.dropout = dropout;
    }
}