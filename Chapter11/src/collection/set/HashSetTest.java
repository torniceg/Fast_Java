package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
//		ArrayList<String>	set = new ArrayList<String>();
		HashSet<String>	set = new HashSet<String>();
		set.add("�̼���");
		set.add("������");
		set.add("������");
		set.add("�̼���");
		
		System.out.println(set);
		
		Iterator<String> ir = set.iterator();
		
		while( ir.hasNext() ) {
			String str = ir.next();
			System.out.println(str);
		}
	}

}
