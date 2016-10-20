package epam.homework.task2.Book;

public class Book implements Cloneable, Comparable<Object> {

	private String title;

	private String author;

	private int price;

	private int edition;

	private int isbn;

	public Book(String title, String author, int price, int edition, int isbn) {

		this.title = title;

		this.author = author;

		this.price = price;

		this.edition = edition;

		this.isbn = isbn;
	}

	@Override

	public String toString() {

		return "name = " + getClass() + " title = " + title + " by author " + author + ". The price is " + price;

	}

	@Override
	public boolean equals(Object obj) {

		if (!super.equals(obj))
			return false;
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Book otherObj = (Book) obj;
		return this.edition == otherObj.edition;

	}

	@Override

	public int hashCode() {

		return 17 + 55 * edition;

	}

	@Override
	public Book clone() throws CloneNotSupportedException {

		Book cloneBook = (Book) super.clone();
		return cloneBook;

	}

	@Override
	public int compareTo(Object obj) {

		Book entry = (Book) obj;

		int result = isbn - entry.isbn;
		if (result != 0) {
			return (int) result / Math.abs(result);
		}

		return 0;
	}

	public int getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}
}
