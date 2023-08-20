package video29;

import java.util.Scanner;

public class Assmt5 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the text to reverse each word of a given text:");
		String txt = scanner.nextLine();
		scanner.close();
		 String words[]=txt.split("\\s"); 
		String rword ="";
		for (int i =0;i<words.length;i++)
		{
			String word = words[i];
			String rdword="";
			for (int j = word.length() - 1; j >= 0; j--) {
				rdword= rdword+word.charAt(j);
			}
			
			rword =rword+rdword+" ";
		}
		System.out.println(rword);
	
	
	}

}
