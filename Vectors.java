package collections;
import java.util.*;
public class Vectors {

	public static void main(String[] args) {
		Vector v = new Vector(30);
		List<String> v1 = new ArrayList<>();
		v1.add("sub1");
		
		
		System.out.println(v1);
		System.out.println(v);
	}
}
class vector{
	String name;
	vector(String name) {
		this.name=name;
		
	}
	public vector(int i) {
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return " "+name;
	}
	
}
