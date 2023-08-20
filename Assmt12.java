package video29;

import java.util.Scanner;

public class Assmt12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter the text to replace the even character with the  plus symbol :");
		//String txt = scanner.nextLine();
		String s1 ="subhash c";
		String s2 = "subhash c from kolar";
		String words[]=s1.split("\\s"); 
		String words1[]=s2.split("\\s"); 
		scanner.close();
		
        for(int i=0; i<=s1.length(); i++){
        	 for(int j=0; j<=s2.length(); j++){
            s1 = s1.substring(j,j++);
            s2 = s2.substring(j,j++);

            if (s1.equalsIgnoreCase(s2) ){
                char counter =0;
				counter++;
				System.out.println(counter);    
            }
      }
        	 }

	
	}

}