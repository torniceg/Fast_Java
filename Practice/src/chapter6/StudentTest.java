package chapter6;

public class StudentTest {

	public static void main( String[] args ) {
		
		Student studentLee = new Student("Lee");
		studentLee.addBook("태백산맥1", "태백");
		studentLee.addBook("태백산맥2", "태백");
		
		Student studentKim = new Student("Kim");
		studentKim.addBook("토지1", "토지");
		studentKim.addBook("토지2", "토지");
		studentKim.addBook("토지3", "토지");
		
		Student studentCho = new Student("cho");
		studentCho.addBook("해리포터1", "해리");
		studentCho.addBook("해리포터2", "해리");
		studentCho.addBook("해리포터3", "해리");
		studentCho.addBook("해리포터4", "해리");
		studentCho.addBook("해리포터5", "해리");
		studentCho.addBook("해리포터6", "해리");
		
		studentLee.showBookInfo();
		studentKim.showBookInfo();
		studentCho.showBookInfo();
		

	}

}
