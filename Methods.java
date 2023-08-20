package collections;
import java.util.*;
public class Methods {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("subhash11");
		al.add("sagar1111");
		al.add("vijay1111");
		al.add("arun11111");
		al.add("seenu1111");
		//al.add( 2,"name");
	

		List<String> al1 = new ArrayList<String>();
		al1.add("vijay1111");
		al1.add("subhash11");//al1.clear();
		al1.add("sagar1111");
		al1.add("vijay1111");
		al1.add("Arun11111");
		al1.add("arun11111");
		al1.add("seenu1111");
		List<String> al2 = new ArrayList<String>();
		//al1.add( 3,"name11");
		//al1.addAll(6 ,al);
		al.sort(Comparator.naturalOrder());
		al1.sort(Comparator.naturalOrder());
//		al.sort(String.CASE_INSENSITIVE_ORDER);
//		al1.sort(String.CASE_INSENSITIVE_ORDER);
		System.out.println(al);
		//  while(al1.remove(1)!=null)
			System.out.println(al1);
			System.out.println(al2);
			System.out.println(al1.subList(2, 7));
		//while(al1.remove("seenu1111"));;
		//System.out.println(al1.contains("seenu1111"));
		//System.out.println(al1.lastIndexOf("vijay1111"));
	
		//System.out.println(al.equals(al1));
		//System.out.println(al2.isEmpty());
			
	
		//Iterator itr =al.iterator();
		//	ListIterator<String> itr = al.listIterator();
//		al.forEach(a->{
//			System.out.println(a);
//		});
//		System.out.println();
//		al1.forEach(a1->{
//			System.out.println(a1);
//		});
		//		System.out.println();
		//		System.out.println("In forword direction");
		//		while(itr.hasNext()){
		//			System.out.println(itr.next());
		//		}

		//		System.out.println();
		//		System.out.println("In reverse direction");
		//		while(itr.hasPrevious()){
		//			System.out.println(itr.previous());
		//		}
	}

}
