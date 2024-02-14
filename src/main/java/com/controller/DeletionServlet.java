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

@WebServlet("/DeletionServlet")
public class DeletionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DeletionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int stuid=Integer.parseInt(request.getParameter("t1"));
		Student s=new Student();
		s.setSid(stuid);
		try
		{
			StudentManager sm=new StudentManager();
			String ack=sm.Deletion(stuid);
			pw.print(ack);	
		}
		catch(Exception e)
		{
			pw.print(e.getMessage());
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
