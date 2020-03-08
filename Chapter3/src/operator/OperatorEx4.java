package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		// 단락 회로 평가
		boolean value = ( (num1 = num1 + 10) < 10 ) && ( (i = 1+2) < 10);
		System.out.println(value);
		System.out.println(i);
		
		int num2 = 10;
		int num3 = 20;
		
		int max = (num2 > num3) ? num2 : num3;
		System.out.println(max);
	}

}
