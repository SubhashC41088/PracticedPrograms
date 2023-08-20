package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetdemo {
	public static void main(String[] args) {
		HashSet hs =new HashSet();
		
		hs.add("subhash");
		hs.add("som");
		hs.add("pradeep");
		hs.add("dhanu");
		hs.add("pradeep");
		
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		}
		
		
	}

}
