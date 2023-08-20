package pp1;

import java.util.Scanner;

public class userInput {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your name");
		String name = scanner.nextLine();
		System.out.printf("Hi %s , How are you\n",name);
		//String status = scanner.nextLine();
		System.out.println("what is your age");
		int age = scanner.nextInt();
		scanner.close();
		if(age<=15) {
		System.out.println("ooh your are minor");
		}
		else {
			System.out.println("ooh your are a major");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("\033[42m Thank you for spending your valuable time \033[42m \n");
	}

}
