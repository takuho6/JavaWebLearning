package jp.itacademy.samples.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/memberOnly")
public class MemberOnlyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<meta charset=\"utf-8\">");

		HttpSession sess = req.getSession(false);
		if (sess == null) {
			out.println("<p>ログインしてください</p>");
			return;
		}

		String account = (String) sess.getAttribute("account");
		if (sess.getAttribute("account") == null) {
			out.println("<p>ログインしてください</p>");
			return;
		}
		out.println("<p>ようこそ" + account + "さん</p>");
	}
}
