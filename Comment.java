package pp1;

import java.util.Scanner;
/**
 * @author Comp 
 * document comment
 * @ comment is used the getting the information about comment
 */

public class Comment {
	
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number ");
			int num = scanner.nextInt();
			if(num % 2 == 0) {
				System.out.println("Entered number is EvenNumber..! ");
			}
			else {
				System.err.println("Entered number is OddNumber..! ");
			}
			scanner.close();
			{
				System.out.println("\033[43m THANK YOU \033[43m\n");
			}

             //single line comments
	
			/*multi
			 * line 
			 * comments
			 */
			
			
//			Comment cmt = new Comment();
			
		}

	}
