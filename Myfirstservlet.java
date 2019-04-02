package com.bgi;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myfirstservlet extends HttpServlet {
	protected  void doPost(HttpServletRequest req , HttpServletResponse resp)throws IOException
	{
	
	PrintWriter obj = resp.getWriter();
	resp.setContentType("text/html");
	
	obj.println("hello world...");
	}

}
