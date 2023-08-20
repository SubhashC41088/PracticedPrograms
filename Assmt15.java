package video29;

import java.util.Scanner;

public class Assmt15 {
	public static void main(String[] args) {
		System.out.println("Enter the text to verify whether the given string is palindrom or not: ");
		Scanner scanner = new Scanner(System.in);
		String txt =scanner.nextLine();
		scanner.close();
		 String  reverse = ""; 
		 int length = txt.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + txt.charAt(i);  
	      if (txt.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
	}

}
