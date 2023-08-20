package video29;

import java.util.Scanner;

public class Assmt13 {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the text to replace the even character with the  plus symbol :");
		    String txt = scanner.nextLine(); 
			System.out.println("Enter the text to replace the even character with the  plus symbol :");
			 String nstr = scanner.nextLine();
			scanner.close();
			for (int i=0; i<txt.length();) {
					nstr=nstr+txt.charAt(0);
					
					break;
			}
			System.out.println(nstr);
	}
	}


