package video29;

import java.util.Scanner;

public class Assmt7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text to find the count of uppercase ,lowercaseletters,digits and special characters");
		String txt = scanner.nextLine();
		scanner.close();
		int upper=0,lower=0,numerics=0,specialCharacter=0;
		
		for(int i=0;i<txt.length();i++) {
			char ch = txt.charAt(i);
			if(ch>='A'&&ch<='Z') 
			   upper++;
			else if(ch>='a'&&ch<='z')
				lower++;
			else if(ch>='0'&&ch<='9')
				numerics++;
			else
				specialCharacter++;
		}
		
		System.out.println("Uppercase letters:"+upper);
		System.out.println("lowercase letters:"+lower);
		System.out.println("numerics: "+numerics);
		System.out.println("specialCharacters:"+specialCharacter);
	}

}
