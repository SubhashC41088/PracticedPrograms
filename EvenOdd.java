package pp2;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int number=0;
		System.out.println("Enter the number to be check");
		Scanner scanner= new Scanner(System.in);
		number = scanner.nextInt();
		scanner.close();

		switch(number%2) {
		case 0:{
			System.out.printf("%d  number is even number",number);
			break;
		}
		case 1:{
			System.out.printf("%d  number is odd number",number);
			break;
		}
		default:{
			System.err.printf("The given input is invalid");
			break;
		}
	
		}

	}


}
