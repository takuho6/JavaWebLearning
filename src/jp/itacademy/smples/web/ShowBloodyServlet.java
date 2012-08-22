package jp.itacademy.smples.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/showBloody")
public class ShowBloodyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<meta charset=\"utf-8\">");
		out.println("<title>result</title>");
		
		String bloodtype = req.getParameter("bloodtype");
		
		switch(bloodtype) {
		case"a":
			out.print("<P>‘å‹g</P>");
			break;
		case"b":
			out.print("<P>‹g</P>");
			break;
		case"o":
			out.print("<P>’†‹g</P>");
			break;
		case"ab":
			out.print("<P>––‹g</P>");
			break;
		}
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		doGet(req, res);
	}
}
