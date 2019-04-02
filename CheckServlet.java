package com.bgi;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckServlet extends HttpServlet {
	protected  void doPost(HttpServletRequest req , HttpServletResponse resp)throws IOException, ServletException
	{
	
		PrintWriter obj = resp.getWriter();
		//resp.setContentType("text/html");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String pn=req.getParameter("pn");


		String psw=req.getParameter("psw");
		String conpsw=req.getParameter("conpsw");
		
		if(psw.equals(conpsw) && fname!="" && lname!=""&& pn!="")
		{
			//PrintWriter obj = resp.getWriter();
			//resp.setContentType("text/html");
			
			obj.println("Successfully logged in...");
		}
		else
		{
			//RequestDispatcher rd = req.getRequestDispatcher();
			
			
			req.getRequestDispatcher("/index.html").include(req, resp);
			obj.println("Incorrect Password");
			
		}

	}
}