package chapter9;

public interface Sort {

	int[] ascendning( int[] arr );
	int[] descendning( int[] arr );
	
	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
	}
}
