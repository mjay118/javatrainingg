
import java.io.Serializable;

import java.util.Date;

public class Employee implements Serializable {
String name;
Date dateOfBirth;
String department;
String designation;
double salary;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
	super();
	this.name = name;
	this.dateOfBirth = dateOfBirth;
	this.department = department;
	this.designation = designation;
	this.salary = salary;
}

}
