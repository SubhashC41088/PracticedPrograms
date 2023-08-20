package pp2;

import java.util.Scanner;

public class TwoNumbers {
	public static void main(String[] args) {
		int result;
		char operator;
		double frstnumr;
		double sndnumr;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number");
		frstnumr =input.nextDouble();
		System.out.println("Enter the second  number");
		sndnumr =input.nextDouble();
		System.out.println("Enter the operator to br perform:'+','-','*','/','%'");
		operator = input.next().charAt(0);
        input.close();

		switch(operator) {
		case '+':{
			result = (int) (frstnumr + sndnumr);
			System.out.println(frstnumr + " + " + sndnumr+ " = " + result);
            break;
		}
		case '-':{
			result = (int) (frstnumr - sndnumr);
			System.out.println(frstnumr + " - " + sndnumr+ " = " + result);
			break;
		}
		case '*':{
			result = (int) (frstnumr - sndnumr);
			System.out.println(frstnumr + " * " + sndnumr+ " = " + result);
			break;
		}
		case '/':{
			result = (int) (frstnumr - sndnumr);
			System.out.println(frstnumr + " / " + sndnumr+ " = " + result);
			break;
		}
		case '%':{
			result = (int) (frstnumr - sndnumr);
			System.out.println(frstnumr + " % " + sndnumr+ " = " + result);
			break;
		}
		default:{
			System.out.println("Invalid input");
			break;
		}

		}

	}
}
