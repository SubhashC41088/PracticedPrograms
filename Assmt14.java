package video29;

import java.util.Scanner;

public class Assmt14 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the file name to print thr filename extension in the console:");
		String txt1= scanner.nextLine();
		scanner.close();
		if(txt1.endsWith("jpg"))
		{
		System.out.println("jpg");
	     }
		else if(txt1.endsWith("png")) {
			System.out.println("png");
		}
		else if(txt1.endsWith("pdf")) {
			System.out.println("pdf");
		}
		else 	
		System.out.println("Invalaid file format");
		}

}
