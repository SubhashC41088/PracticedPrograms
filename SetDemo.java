package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		//LinkedHashSet ls = new LinkedHashSet();
		
		TreeSet ls = new TreeSet();
		
		
	    ls.add(7);
		ls.add(6);
		ls.add(5);
		ls.add(4);	
		ls.add(3);	
		ls.add(2);
		ls.add(1);
		
		System.out.println(ls);
		Iterator it = ls.descendingIterator(); 
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		TreeSet ts1 = (TreeSet)ls.subSet(2,4);
		System.out.println(ts1);
	}

}
