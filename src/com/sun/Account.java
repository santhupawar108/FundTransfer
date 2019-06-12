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
 * Servlet implementation class Account
 */
@WebServlet("/account")
public class Account extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Account() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String bankname = request.getParameter("bankname");
		String acno = request.getParameter("acno");
		String ifsc = request.getParameter("ifsc");
		String mobile = request.getParameter("mbl");
		String mpin = request.getParameter("mpin");
		String rmpin = request.getParameter("rmpin");
		PrintWriter pw = response.getWriter();

		if(mpin != rmpin) {
			pw.println("Mpin not matching");
		}
	
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fund","root","");
			PreparedStatement ps = con.prepareStatement("insert into account values(?,?,?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, bankname);
			ps.setString(3, acno);
			ps.setString(4, ifsc);
			ps.setString(5, mobile);
			ps.setString(6, mpin);
			ps.setString(7, rmpin); 
			
			
			
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
