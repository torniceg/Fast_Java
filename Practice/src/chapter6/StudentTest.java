package chapter6;

public class StudentTest {

	public static void main( String[] args ) {
		
		Student studentLee = new Student("Lee");
		studentLee.addBook("�¹���1", "�¹�");
		studentLee.addBook("�¹���2", "�¹�");
		
		Student studentKim = new Student("Kim");
		studentKim.addBook("����1", "����");
		studentKim.addBook("����2", "����");
		studentKim.addBook("����3", "����");
		
		Student studentCho = new Student("cho");
		studentCho.addBook("�ظ�����1", "�ظ�");
		studentCho.addBook("�ظ�����2", "�ظ�");
		studentCho.addBook("�ظ�����3", "�ظ�");
		studentCho.addBook("�ظ�����4", "�ظ�");
		studentCho.addBook("�ظ�����5", "�ظ�");
		studentCho.addBook("�ظ�����6", "�ظ�");
		
		studentLee.showBookInfo();
		studentKim.showBookInfo();
		studentCho.showBookInfo();
		

	}

}
