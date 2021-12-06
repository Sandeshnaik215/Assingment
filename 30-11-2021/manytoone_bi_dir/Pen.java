package com.hibernate.mapping.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Pen {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int pen_id;
private String name;
@ManyToOne(cascade = CascadeType.PERSIST)
@JoinColumn(referencedColumnName = "box_id")
private Box box;
public int getPen_id() {
	return pen_id;
}
public void setPen_id(int pen_id) {
	this.pen_id = pen_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Box getBox() {
	return box;
}
public void setBox(Box box) {
	this.box = box;
}

}
