package com.techno.SpringCore.beans.assignment;

public class Engine {
private int id;
private String power;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPower() {
	return power;
}
public void setPower(String power) {
	this.power = power;
}
@Override
public String toString() {
	return "Engine [id=" + id + ", power=" + power + "]";
}

}
