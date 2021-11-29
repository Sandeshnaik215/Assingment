package com.techno.casestudy.phone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="phone_call")
public class Call {
@Id
private int id;
private String name;
private long num;
private String email;
public Call() {};
public Call(String name, long num, String email) {
	super();
	this.name = name;
	this.num = num;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getNum() {
	return num;
}
public void setNum(long num) {
	this.num = num;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Call [id=" + id + ", name=" + name + ", num=" + num + ", email=" + email + "]";
}



}
