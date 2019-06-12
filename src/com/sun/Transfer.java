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
 * Servlet implementation class Transfer
 */
@WebServlet("/transfer")
public class Transfer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transfer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		// my changes
	/**	String tempname = " ";
		String tempacno = " ";
		String tempifsc = " ";
		String tempamount = " "; **/
		
				String[] name = request.getParameterValues("name");
				String[] acno = request.getParameterValues("acno");
				String[] ifsc = request.getParameterValues("ifsc");
				String[] amount = request.getParameterValues("amount");
				PrintWriter pw = response.getWriter();

				for (int i = 0; i < name.length; i++)
			    {
			      ps(name[i], acno[i], ifsc[i], amount[i]);
			    }
			
				try {
					
					
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost/fund","root","");
					for(int j=1;j<=100;j++) {
					PreparedStatement ps = con.prepareStatement("insert into transfer values(?,?,?,?)");
					ps.setString(1, name);
					ps.setString(1, acno);
					ps.setString(1, ifsc);
					ps.setString(1, amount);
					
					 
					
					
					
					int i = ps.executeUpdate();
					if(i>0) {
						pw.println("Sucessfully transfer your amount");
					
					System.out.println("working");
					
					}
					else {
						pw.println("not working");
						System.out.println("not working");
					}
					
					}
				}catch(Exception e){System.out.println(e);}
				
				
				// end my changes
		
		
		
		
	}

	private void ps(String string, String string2, String string3, String string4) {
		// TODO Auto-generated method stub
		
	}

}
