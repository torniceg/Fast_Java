package chapter4;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		System.out.println("È¦¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä.");
		
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		
		if( length % 2 == 0 ) {
			System.out.println("È¦¼ö°¡ ¾Æ´Õ´Ï´Ù.");
			
		} else {
		
			int starCount = 1;
			int spaceCount;
			String line;
			boolean maxLength = false;
			while( starCount > 0 ) {
				line = "";
				spaceCount = (length - starCount) / 2;
				for( int i=0; i<length; i++ ) {
					if( i < spaceCount ) {
						line += "-";
					} else if( i < spaceCount + starCount ) {
						line += "*";
					} else {
						line += "+";
					}
				}
				
				System.out.println(line);
				
				if( maxLength ) {
					starCount -= 2;
				} else {
					starCount += 2;
				}
				
				if( starCount == length ) {
					maxLength = true;
				}
				
			}
		
		}
		

	}

}
