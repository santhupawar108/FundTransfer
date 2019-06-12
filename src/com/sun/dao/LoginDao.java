package com.sun.dao;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	
	//static String sql="select * from register where uname=? and psw=?";
	
	public static boolean validate(String uname,String password){  
		 
	
	try {
		//Class.forName("oracle.jdbc.driver.OracleDriver");
	Class.forName("com.mysql.jdbc.Driver");
	
	//Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","pawar");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fund","root","");
	PreparedStatement ps=con.prepareStatement("select * from register where uname=? and password=?");  
			ps.setString(1,uname);  
			ps.setString(2,password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				//rs.getString(1);
				//rs.getString(2);
				//status = rs.next();
				return true;
			
				
				
			}
			
			ps.close();
		con.close();
	}catch(Exception e) {System.out.println(e);}
	
	
	return false;

}
	
}
