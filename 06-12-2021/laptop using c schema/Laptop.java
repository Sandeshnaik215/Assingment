package com.techno.SpringCore.beans.assignment2;

public class Laptop {
private RAM r;
private MotherBoard mdb;
private Screen scra;
private Processor ps;

public Laptop(RAM r, MotherBoard mdb, Screen scra, Processor ps) {

	this.r = r;
	this.mdb = mdb;
	this.scra = scra;
	this.ps = ps;
}

@Override
public String toString() {
	return "Laptop [r=" + r + ", mdb=" + mdb + ", scra=" + scra + ", ps=" + ps + "]";
}



}
