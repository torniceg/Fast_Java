package object;

class Student {
	int studentNum;
	String studentName;
	
	public Student( int studentNum, String studentName ) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

//	@Override
//	public boolean equals( Object obj ) {
//		if( obj instanceof Student ) {
//			Student std = (Student)obj;
//			return (this.studentNum == std.studentNum);
//		}
//		return false;
//	}

//	@Override
//	public int hashCode() {
//		return studentNum;
//	}
	
}

public class EqualsTest {

	public static void main( String[] args ) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println( str1 == str2 );
		System.out.println( str1.equals(str2) );
		
		Student Lee = new Student(100, "�̼���");
		Student Lee2 = Lee;
		Student Shin = new Student(100, "�̼���");
		
		System.out.println(Lee == Lee2);
		System.out.println(Lee == Shin);
		System.out.println(Lee.equals(Lee2));
		System.out.println(Lee.equals(Shin));
		
		System.out.println(Lee.hashCode());
		System.out.println(Lee2.hashCode());
		System.out.println(Shin.hashCode());
		
		Integer i1 = 100;
		Integer i2 = 100;
		Integer oi1 = new Integer(100);
		Integer oi2 = new Integer(100);
		
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		System.out.println(oi1==oi2);
		System.out.println(oi1.equals(oi2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(oi1.hashCode());
		System.out.println(oi2.hashCode());
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		System.out.println(System.identityHashCode(oi1));
		System.out.println(System.identityHashCode(oi2));
	}

}
