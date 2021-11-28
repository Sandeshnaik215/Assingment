package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class login {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Connection connection=null;
	PreparedStatement preparedStatement=null;
	
	
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/registerdemo","root","root");
		System.out.println("Login\n");
		System.out.print("Email  : ");
		String email=sc.nextLine();
		System.out.print("Password      : ");
		String pass=sc.nextLine();
		
		
		String query1="select password from userregister where email=?";
		
		preparedStatement=connection.prepareStatement(query1);
		
		preparedStatement.setString(1, email);
		ResultSet resultSet=preparedStatement.executeQuery();
	while(resultSet.next()) {
		String rst=resultSet.getString(1);
		if(pass.equals(rst)) {
			System.out.println("login Successfully......");
		}else {
			System.out.println("Wrong password.");
		}
	}
		
	} catch (ClassNotFoundException | SQLException e) {
		System.out.println("Wrong Credential");
	
	}
}
}
