package com.hibernate.mapping.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cities {
@Id
private int id;
private String cityName;
@ManyToOne(cascade = CascadeType.PERSIST)
@JoinColumn(referencedColumnName = "id")
List<State> list1;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCityName() {
	return cityName;
}
public void setCityName(String cityName) {
	this.cityName = cityName;
}

}
