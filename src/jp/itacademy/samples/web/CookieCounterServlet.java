package jp.itacademy.samples.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieCounter")
public class CookieCounterServlet extends HttpServlet {

	private static final int SECONDS_PER_YEAR = 365 * 24 * 60 * 60;

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		int count = 0;
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				if (c.getName().equals("Count")) {
					count = Integer.parseInt(c.getValue());
				}
			}
		}

		++count;
		Cookie cookie = new Cookie("Count", String.valueOf(count));
		cookie.setMaxAge(SECONDS_PER_YEAR);
		res.addCookie(cookie);

		res.setContentType("text/html; charset=utf-8");
		PrintWriter out = res.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<meta charset='utf-8'>");
		out.println("<p>Ç†Ç»ÇΩÇÃñKñ‚âÒêî: " + count + "âÒ</p>");
	}
}
