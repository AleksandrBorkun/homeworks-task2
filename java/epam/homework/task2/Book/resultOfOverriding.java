package epam.homework.task2.Book;

import java.util.TreeSet;

public class resultOfOverriding {

	public static void main(String args[]) throws CloneNotSupportedException {

		// Вводим значения в порядке : title : author : price : edition

		Book book = new Book("Title", "Name Surname", 200, 2012, 8);
		Book otherBook = new Book("New Title", "Strange Name", 50, 2010, 5);

		Book cloneBook = book.clone();

		String a = "car";
		String b = "car";

		TreeSet<Book> list = new TreeSet<Book>();
		list.add(book);
		list.add(otherBook);
		list.add(new Book("blabla", "nanananana", 210, 1026, 1));

		for (Book e : list) {
			System.out.println(e.toString() + ". ISBN = " + e.getIsbn());
		}

		System.out.println(a.equals(b));

		System.out.println(cloneBook.toString());
		System.out.println(book.hashCode());
		System.out.println(otherBook.hashCode());

		System.out.println(book.equals(otherBook));

		System.out.println(book.toString());

	}

}