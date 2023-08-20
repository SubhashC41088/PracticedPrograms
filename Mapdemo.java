package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Mapdemo {
	public static void main(String[] args) {
		
		//hashmap
		//linkedhashmap
		//TreeMap
		//HashTable
		
		//HashMap hm = new HashMap();
			//LinkedHashMap hm = new LinkedHashMap();
		//TreeMap hm = new TreeMap();
		Hashtable hm = new Hashtable();
	
		hm.put(101," sub");
		hm.put(102, " sagr");
		hm.put(103, " arun");
		hm.put(107, " vijay");
		hm.put(104, " seenu");
		hm.put(105, " som");
		hm.put(106, " pradeep");
	
		Set s = hm.keySet();
		
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			String str =obj.toString();
			System.out.println(str+"  <=> "+ hm.get(obj));
		}
		
//		
//		while(hm!=null) {
//			System.out.println(hm);
//			break;
//		}
//		 System.out.println(hm.get(102));
//		 
//		System.out.println( hm.keySet());
	}

}
