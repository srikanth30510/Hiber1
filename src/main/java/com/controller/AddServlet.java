package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;
import com.model.StudentManager;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	    PrintWriter pw=response.getWriter();
	    int stuid=Integer.parseInt(request.getParameter("t1"));
	    String stuname=request.getParameter("t2");
	    String studept=request.getParameter("t3");
	    Student s1=new Student();
	    s1.setSid(stuid);
	    s1.setSname(stuname);
	    s1.setSdept(studept);
	    try {
	    	StudentManager sm=new StudentManager();
	    	String ack=sm.insertData(s1);
	    	pw.print(ack);
	    }
	    catch (Exception e) {
	    	pw.print(e.getMessage());
	    }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
