package com.sun;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.dao.LoginDao;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String uname = request.getParameter("uname");
		String password = request.getParameter("password");
		PrintWriter writer = response.getWriter();
		LoginDao dao= new LoginDao();
	//System.out.println("Hello work");

		if(dao.validate(uname, password)) {
			//System.out.println("Hello work");
			
			HttpSession session = request.getSession();
			session.setAttribute("uname", uname);
		//if(uname.equals("admin")&& upass.equals("123")) {
			response.sendRedirect("dashboard.jsp");
		}
		else {
			writer.print("Sorry Name and password is incorrect");
			System.out.println("not work");
			response.sendRedirect("index.jsp");
		} //close else
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
