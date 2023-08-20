package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Collecns {public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(4);
	al.add(1);
	al.add(2);
	al.add(3);
	

	System.out.println(al);
	//Collections.reverse(al);
	Collections.swap(al,2,3);
	System.out.println(al);
	System.out.println(Collections.max(al));
	
}
	
}
