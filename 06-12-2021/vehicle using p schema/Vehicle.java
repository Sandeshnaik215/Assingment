package com.techno.SpringCore.beans.assignment;

public class Vehicle {
	private String brand;
	private double price;
	private Wheel wheel;
	private Engine engine;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", price=" + price + ", wheel=" + wheel + ", engine=" + engine + "]";
	}
	
}
