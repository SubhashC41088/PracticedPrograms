package collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s= new Stack();
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		System.out.println(s);
		
		
		s.pop();
		System.out.println(s);
		//s.peek();
		System.out.println(s.peek());
		System.out.println(s.empty());
		System.out.println(s.search(6));
	}

}
