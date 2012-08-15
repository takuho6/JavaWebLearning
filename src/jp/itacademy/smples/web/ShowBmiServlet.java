package jp.itacademy.smples.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//BMI���̏d�ikg�j���i�g���im�j�~�g���im�j)

@WebServlet("/showbmi")
public class ShowBmiServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<meta charset=\"utf-8\">");
		out.println("<title>show Bmi</title>");
        
        double sincho = Double.parseDouble(req.getParameter("sincho"));
        double taiju = Double.parseDouble(req.getParameter("taiju"));
		
		double bmi = taiju/((sincho/100)*(sincho/100));
		
		
		out.println("<P>���Ȃ���BMI��" + bmi + "�ł��B</P>");

	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		doGet(req, res);
	}
	

}
