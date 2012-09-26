package jp.itacademy.samples.web.mvc.books;

public class Book {

	private String title;
	private Author author;
	private int price;
	private int quantity;

	public Book(String title, Author author, int price, int quantity) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}

	public String getTitle() {
		return title;
	}

	public Author getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
}
