package video29;
import java.util.Scanner;

public class Assmt9 {
	public static void main(String[] args ) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text to find the first repeated and non-repeated character in string");
	  String txt = scanner.nextLine();
	  scanner.close();
	 // char firsRepeatedtWord=' ',firstNonRepeatedWord=' ';
	  boolean isFound = true;
	  for(int i=0; i<txt.length(); i++) {
	  for(int j=i+1; j<txt.length(); j++) {
          if(txt.charAt(i)==txt.charAt(j)) {
              System.out.println(txt.charAt(i)+" :is the first repeated character that occurs");
               isFound = true;
               
              break;
		  }
	  }
	  if(isFound) {
          break;
      }
	 
      }
	  
	   for(char k :txt.toCharArray()){
		    if ( txt.indexOf(k) == txt.lastIndexOf(k)) {
		        System.out.println( k+" :First non-repeating character that occurs");
		        break;
		    }
		    }
      }
	}
	  
