package com.hibernate.mapping.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;
@Entity
public class Box {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int box_id;
private String name;
@OneToMany(cascade = CascadeType.PERSIST)
@JoinColumn(referencedColumnName = "pen_id")
private Pen pen;
public int getBox_id() {
	return box_id;
}
public void setBox_id(int box_id) {
	this.box_id = box_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Pen getPen() {
	return pen;
}
public void setPen(Pen pen) {
	this.pen = pen;
}



}
