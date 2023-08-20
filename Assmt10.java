package video29;

import java.util.Arrays;
import java.util.Scanner;

public class Assmt10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text to create an array using words at even positions in a string");
		String txt = scanner.nextLine();
		scanner.close();
		String[] words= txt.split("\\s");
		for(int i=1;i<=words.length;i=i+2) {

			
				System.out.print(Arrays.toString(words[i].split("\\s+")));

		
	}

	}}


