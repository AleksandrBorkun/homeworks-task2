package epam.homework.task2.ProgrammerBook;

import epam.homework.task2.Book.Book;

public class ProgrammerBook extends Book {

	private String language;
	private int level;

	public ProgrammerBook(String title, String author, String language, int level, int price, int edition, int isbn) {
		super(title, author, price, edition, isbn);

		this.language = language;
		this.level = level;

	}

	@Override
	public String toString() {

		return super.toString() + ". The language is " + language + ". Level is " + level;

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
		ProgrammerBook pBook = (ProgrammerBook) obj;
		return this.hashCode() == pBook.hashCode();
	}

	@Override
	public int hashCode() {

		return 123 + level * 13;
	}

}
