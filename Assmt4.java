package video29;

import java.util.Scanner;

public class Assmt4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text to remove all starting and ending spaces:");
		String txt = scanner.nextLine();
		System.out.println(txt.trim());
	    scanner.close();
	}

}
