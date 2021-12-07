package com.techno.SpringCore.beans.assignment2;

public class Processor {
private String Pname;



public Processor(String pname) {
	super();
	Pname = pname;
}



@Override
public String toString() {
	return "Processor [Pname=" + Pname + "]";
}

}
