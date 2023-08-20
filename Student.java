package pp1;

public class Student {
    int id = 101;
    
   String name= "subhash c";
    static String NAME = "chandra";
    String stateTelephoneDirectory = "test";
    char sec = 'A';
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.id);
		System.out.println(student.sec);
		System.out.println(new Student().name);
		int height = 70;
		System.out.println(height);
        test1(40); 
        System.out.println(NAME);

	}
	public static void test1(int height) {
		System.out.println(height);
	
	}
}
