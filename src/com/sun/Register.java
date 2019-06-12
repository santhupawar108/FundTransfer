package com.sun;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String uname = request.getParameter("uname");
		String mobile = request.getParameter("mobile");
		String birth = request.getParameter("birth");
		String psw = request.getParameter("psw");
		String rpsw = request.getParameter("rpsw");
		
		PrintWriter pw = response.getWriter();

		if(psw != rpsw) {
			pw.println("password not matching");
		}
	
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fund","root","");
			PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, uname);
			ps.setString(3, mobile);
			ps.setString(4, birth);
			ps.setString(5, psw);
			ps.setString(6, rpsw);
			 
			
			
			
			int i = ps.executeUpdate();
			if(i>0) {
				pw.println("Sucessfully Added Your Account");
			
			System.out.println("working");
			
			}
			else {
				pw.println("not working");
				System.out.println("not working");
			}
		}catch(Exception e){System.out.println(e);}
		
	}

}
