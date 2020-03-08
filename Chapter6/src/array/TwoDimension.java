package array;

public class TwoDimension {
	
	public static void main( String[] args ) {
		
//		int[] arr = { 4,5,6 };
//		
//		for( int i : arr ) {
//			System.out.println( i );
//		}
		
		
		int[][] arr = { {1,2,3}, {4,5,6,7} };
		
		for( int[] is : arr ) {
			for( int is2 : is ) {
				System.out.print( is2 );
			}
			System.out.println( );
		}
		
		
	}

}
