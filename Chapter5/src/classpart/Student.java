package classpart;

public class Student {
	
	public int studentID;
	public String studentName;
	public String address;
	
	public Student( String name ) {
		studentName = name;
	}
	
	public Student( int id, String name ) {
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	public String getSutdentName() {
		return this.studentName;
	}
	
}
