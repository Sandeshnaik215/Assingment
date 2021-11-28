package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class jdbcmain {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Connection connection=null;
	PreparedStatement preparedStatement=null;
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/registerdemo";
		connection =DriverManager.getConnection(url,"root","root");
		
		
		System.out.println("Registration Form ");
		System.out.print("Name       : ");
		String name=sc.nextLine();

		System.out.print("Email      : ");
		String email=sc.nextLine();
		System.out.print("Password      : ");
		String pass=sc.nextLine();
		System.out.print("Batch No.  : ");
		String bname=sc.nextLine();
		
		System.out.print("Mobile No. : ");
		long num=sc.nextLong();
		
		String query="insert into userregister values(?,?,?,?,?)";
		
		preparedStatement=connection.prepareStatement(query);
		
		preparedStatement.setString(1, name);
		preparedStatement.setLong(2, num);
		preparedStatement.setString(3, email);
		preparedStatement.setString(4, bname);
		preparedStatement.setString(5, pass);
		
		int result=preparedStatement.executeUpdate();
		
		if(connection!=null) {
			System.out.println("Register Successfully....");
		}
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}
}
