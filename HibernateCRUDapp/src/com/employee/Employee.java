package com.employee;

public class Employee {
int eid,age,salary,pin,mob;
String ename,desg,address;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public int getMob() {
	return mob;
}
public void setMob(int mob) {
	this.mob = mob;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", age=" + age + ", salary=" + salary + ", pin=" + pin + ", mob=" + mob + ", ename="
			+ ename + ", desg=" + desg + ", address=" + address + "]";
}

}
