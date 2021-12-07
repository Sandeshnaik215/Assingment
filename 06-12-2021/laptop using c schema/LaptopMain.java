package com.techno.SpringCore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techno.SpringCore.beans.assignment2.Laptop;

public class LaptopMain {
public static void main(String[] args) {
ApplicationContext context = new ClassPathXmlApplicationContext("laptop.xml");
Laptop bean = (Laptop) context.getBean("lap");
System.out.println(bean);

}
}
