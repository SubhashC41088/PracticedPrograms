package video29;

import java.util.Scanner;

public class Assmt3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text to reverse:");
		String txt = scanner.nextLine();


	char ch;
	String nstr="";
		for (int i=0; i<txt.length(); i++)
	      {
	        ch= txt.charAt(i); 
	        nstr=ch+nstr;
	      }
		System.out.println(nstr);
		scanner.close();
	}

}
