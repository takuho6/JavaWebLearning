package jp.itacademy.smples.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<meta charset=\"utf-8\">");

		req.setCharacterEncoding("utf-8");
		String account = req.getParameter("account");
		String pass = req.getParameter("pass");

		if (account == null || account.equals("") || pass == null
				|| pass.equals("")) {
			out.println("<p>�A�J�E���g�ƃp�X���[�h����͂��Ă�������</p>");
			return;
		}
		if (account.equals(pass)) {
			out.println("<p>�A�J�E���g�܂��̓p�X���[�h���Ⴂ�܂�</p>");
			return;
		}

		HttpSession sess = req.getSession();
		sess.setAttribute("account", account);
		out.println("<p>���O�C�����܂���</p>");
		out.println("<p><a href=\"memberOnly\">�����p�y�[�W</a></p>");
	}
}
