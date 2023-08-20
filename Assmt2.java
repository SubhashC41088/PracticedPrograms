package video29;

import java.util.Scanner;

public class Assmt2 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the text to count the number of words:");
	String txt = scanner.nextLine();

	String[] tx = txt.split("\\s+");
	System.out.println(tx.length);
	scanner.close();
}
}
