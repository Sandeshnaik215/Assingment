package com.hibernate.mapping.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class State {
@Id

private int idc;
private String state_n;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(referencedColumnName = "idc")
private List<Cities> cities;


public int getIdc() {
	return idc;
}
public void setIdc(int idc) {
	this.idc = idc;
}
public String getState_n() {
	return state_n;
}
public void setState_n(String state_n) {
	this.state_n = state_n;
}
public List<Cities> getCities() {
	return cities;
}
public void setCities(List<Cities> cities) {
	this.cities = cities;
}






}
