package chapter6;

import java.util.ArrayList;

public class Student {

	private String name;
	private ArrayList<Book> bookList;
	
	public Student(String name) {
		this.name = name;
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String name, String author) {
		Book book = new Book(name, author);
		bookList.add(book);
	}
	
	public void showBookInfo() {
		System.out.print( name + " 학생이 읽은 책은 : ");
		for( Book book : bookList ) {
			System.out.print( book.getName() + " " );
		}
		System.out.println("입니다");
	}
}
