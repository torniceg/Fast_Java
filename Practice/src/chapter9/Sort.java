package chapter9;

public interface Sort {

	int[] ascendning( int[] arr );
	int[] descendning( int[] arr );
	
	default void description() {
		System.out.println("���ڸ� �����ϴ� �˰��� �Դϴ�.");
	}
}
