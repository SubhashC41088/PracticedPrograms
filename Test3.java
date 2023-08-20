package Ststic;

public class Test3 {
//	static {
//		System.out.println("static method");
//	}
	{
		System.out.println("non-static method");
	}
	public Test3(){
		
		System.out.println("constructor");
		
	}
	public static void main(String[] args) {
		System.out.println("main method");
		new Test3();
	}

}
