package video29;

import java.util.Scanner;

public class Assmt33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter th text to count the total number of occurances of a given character in a string");
		String txt = scanner.nextLine();
		System.out.println("Enter the character to check");
		char txt1 = scanner.next().charAt(0);
		scanner.close();
		int count=0;

		    for(int i=0;i<txt.length();i++) {
			if(txt.charAt(i)==txt1) 
			  count++;
			
		
}
		    System.out.println("occured times is: "+count);
		
	}
}
