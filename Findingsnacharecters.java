package myrevision;

import java.util.Scanner;

public class Findingsnacharecters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the sentence which is to check ");
		String str =  scanner.nextLine();
	
		scanner.close();

		 String number = "";
         String Alpha = "";
         String symbol = "";
         
         for (int i = 0; i < str.length(); i++) {
        	 
                char a = str.charAt(i);
                
                if (Character.isDigit(a)) {
                      number = number + a;
                      
                } 
                
                else if(Character.isAlphabetic(a)){
                    Alpha = Alpha + a;
                    
              }
                else  {
                	symbol = symbol+a;
                	
                }
                
         }

         System.out.println();
         System.out.println(number);
         System.out.println();
         System.out.println(Alpha);
    
         System.out.println(symbol);
	}

}

