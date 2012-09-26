package jp.itacademy.samples.web.mvc.books;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mvc/books")
public class ShowBooksServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		List<Book> books = new ArrayList<>();

		Author akutagawa = new Author("—´”V‰î<script>alert('‚â‚ A‚Ú‚­‚Í—´”V‰îI')</script>", "ŠHì");
		Author dazai = new Author("¡", "‘¾É");

		books.add(new Book("—…¶–å", akutagawa, 800, 3));
		books.add(new Book("’wå‚Ì…", akutagawa, 500, 5));
		books.add(new Book("lŠÔ¸Ši", dazai, 1000, 0));

		req.setAttribute("books", books);

		req.getRequestDispatcher("/WEB-INF/mvc/books/index.jsp")
		.forward(req,res);

	}
}