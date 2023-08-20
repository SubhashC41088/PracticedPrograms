package video29;


import java.util.Scanner;

public class Assmt11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text to find max length word :");
		String txt = scanner.nextLine();
		scanner.close();
		String[] word = txt.split(" ");
	 
	    String maxlethWord = "";
	    for(int i = 0; i < word.length; i++){
	            if(word[i].length() > maxlethWord.length()){
	            	
	                  maxlethWord = word[i];
	            } 
	    }
	     System.out.println(maxlethWord);  
	
	
	}
	
	}

