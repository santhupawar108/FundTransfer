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
 * Servlet implementation class Benfic
 */
@WebServlet("/benfic")
public class Benfic extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Benfic() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// my changes
		
		
		String name = request.getParameter("name");
		//String bankname = request.getParameter("bankname");
		String acno = request.getParameter("acno");
		String ifsc = request.getParameter("ifsc");
		String mobile = request.getParameter("mbl");
		String purpose = request.getParameter("purpose");
		PrintWriter pw = response.getWriter();

		
	
		try {
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fund","root","");
			PreparedStatement ps = con.prepareStatement("insert into benfic values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, acno);
			ps.setString(3, ifsc);
			ps.setString(4, mobile);
			ps.setString(5, purpose);
			 
			
			
			
			int i = ps.executeUpdate();
			if(i>0) {
				pw.println("Sucessfully Added New Benficiary");
			
			System.out.println("working");
			
			}
			else {
				pw.println("not working");
				System.out.println("not working");
			}
		}catch(Exception e){System.out.println(e);}
		
		
		// end my changes
	}

}
