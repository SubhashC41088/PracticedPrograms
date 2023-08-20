package video29;

import java.util.Scanner;

public class Assmt1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text which is to count the number of characters:");
		String txt = scanner.nextLine();
		System.out.println(txt.length());
		scanner.close();
	}

}
