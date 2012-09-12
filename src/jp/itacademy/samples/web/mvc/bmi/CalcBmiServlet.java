package jp.itacademy.samples.web.mvc.bmi;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcBmiServlet
 */
@WebServlet("/CalcBmiServlet")
public class CalcBmiServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		double weight;
		double height;
		try {
			weight = Double.parseDouble(req.getParameter("weight"));
			height = Double.parseDouble(req.getParameter("height"));
		} catch (Exception e) {
			req.setAttribute("error", "ÉpÉâÉÅÅ[É^Ç™ê≥ÇµÇ≠Ç†ÇËÇ‹ÇπÇÒ");
			req.getRequestDispatcher("/WEB-INF/mvc/bmi/result.jsp")
			.forward(req, res);
			return;
		}
		
//		Person person = new Person(height, weight);
//		req.setAttribute("person", person);
		
		req.getRequestDispatcher("/WEB-INF/mvc/bmi/result.jsp")
		.forward(req, res);
		
	}
}
