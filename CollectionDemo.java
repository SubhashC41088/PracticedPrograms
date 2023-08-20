package collections;
import java.util.*;

class Student{
	int rollno;
	String name,Address;

	Student(int rollno,String name,String Address){
		this.rollno=rollno;
		this.name=name;
		this.Address=Address;

	}

	public Student(int i) {
		// TODO Auto-generated constructor stub
	}
}
public class CollectionDemo {
	public static void main(String[] args) {
		System.out.println("sub");
		List<Student> list = new ArrayList<Student>();

		Student st1 = new Student(401,"subhash", "kolar,karnataka");
		Student st2 = new Student(402, "som", "malur,karnataka");
		Student st3 = new Student(403, "pradee", "bangarpet,karnataka");
		Student st4 = new Student(404, "dhanu", "mulubagal,karnataka");

		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		System.out.println(list.size());
		for(Student s:list) {
			System.out.println(s.rollno+" "+ s.name+" "+ s.Address+" ");
		}


	}

}
