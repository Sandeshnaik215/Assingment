package com.techno.SpringCore.beans.assignment;

public class Wheel {
private int size;
private String Tbrand;
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public String getTbrand() {
	return Tbrand;
}
public void setTbrand(String tbrand) {
	Tbrand = tbrand;
}
@Override
public String toString() {
	return "Wheel [size=" + size + ", Tbrand=" + Tbrand + "]";
}

}
