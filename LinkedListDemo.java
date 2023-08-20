package collections;

import java.util.*;

public class LinkedListDemo {
	
public static void main(String[] args) {
	LinkedList<Students> ll = new LinkedList<Students>();

		ll.add(new Students(34));

	Students s2 = new Students(103);
	Students s3 = new Students(102);
	Students s4 = new Students(104);
	ll.add(s2);
	ll.addFirst(s2);
	ll.addLast(s3);
	ll.add(0, s4);
	System.out.println(ll.get(1));
	
	//System.out.println(ll);
	
	Iterator<Students> it = ll.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		
	}

}
}
	class Students {
	int rollno ;
	
	
	Students(int rollno) {
		this.rollno=rollno;
		
}public String toString() {
			return " "+rollno;
		}

}

