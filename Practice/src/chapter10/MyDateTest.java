package chapter10;

class MyDate {
	
	int day;
	int month;
	int year;
	
	public MyDate( int day, int month, int year ) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	@Override
	public boolean equals( Object obj ) {
		if( obj instanceof MyDate ) {
			MyDate date = (MyDate)obj;
			if( this.day == date.day && this.month == date.month && this.year == date.year ) {
				return true;
			}
			return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return ((this.year * 100) + this.month * 100) + this.day ;
//		return super.hashCode();
	}
	
}

public class MyDateTest {

	public static void main( String[] args ) {

		MyDate date1 = new MyDate(10, 12, 2020);
		MyDate date2 = new MyDate(10, 12, 2020);

		System.out.println(date1.equals(date2));
		System.out.println(date1 == date2);
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
		System.out.println(System.identityHashCode(date1));
		System.out.println(System.identityHashCode(date2));
	}

}
