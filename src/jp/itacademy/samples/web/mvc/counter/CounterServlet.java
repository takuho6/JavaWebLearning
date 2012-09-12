package jp.itacademy.samples.web.mvc.counter;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/mvc/counter")
public class CounterServlet extends HttpServlet {

	private static final String COUNTER_KEY = "counter";

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		/*
		 * HttpSession session = req.getSession(); Counter counter = (Counter)
		 * session.getAttribute(COUNTER_KEY);
		 * 
		 * if (counter == null) { counter = new Counter();
		 * session.setAttribute(COUNTER_KEY, counter); }
		 */
		/*
		 * Counter counter = (Counter) req.getAttribute("counter");

		if (counter == null) {
			counter = new Counter();
			req.setAttribute("counter", counter);
		}
		*/
		ServletContext context = getServletContext();
		Counter counter = (Counter) context.getAttribute(COUNTER_KEY);
		
		if (counter == null) {
			counter = new Counter();
			context.setAttribute("counter", counter);
		}
		counter.inc();

		req.getRequestDispatcher("/WEB-INF/mvc/counter/result.jsp").forward(
				req, res);
	}
}