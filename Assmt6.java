package video29;


import java.util.Scanner;

public class Assmt6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
System.out.println("Enter the text to modify the string in the following pattern(this is so exited) to(THIS si SO detixe)");
  		String txt = scanner.nextLine();
  		scanner.close();
  		 String[] t = txt.split(" ");
  		String val = "";
  		for (int i = 0; i < t.length; i++) {

  		    if (i % 2 == 1)
  		        val = val + new StringBuilder(t[i]).reverse().toString() + " ";
  		    else
  		        val =val + t[i].toUpperCase() + " ";
  		}
  		val = val.trim();
  		System.out.println(val);
}
}