package com.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student1")
public class Student {
@Id
@Column(name = "StudentId")
int sid;
@Column(name = "StudentName")
String sname;
@Column(name = "StudentDepartment")
String sdept;
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid; 
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSdept() {
	return sdept;
}
public void setSdept(String sdept) {
	this.sdept = sdept;
}

}
