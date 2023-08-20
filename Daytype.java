package pp1;

import java.util.Scanner;

public class Daytype {
	public static void main(String[] args) {
		String day = new String();
		System.out.println("Enter the Day to be check");
         Scanner dayname = new Scanner(System.in);   
      	System.out.printf("Today is ,%s",day);
      	dayname.close();
     	}
     public static void dayName(String dayname) {
     	if(dayname.equals("sunday")){
     		System.out.println("Yayy,its weekend");
     	}
     	else if(dayname.equals("monday")) {
     		System.out.println("uff,its weekday");
     	}
     	else if(dayname.equals("tuesday")) {
     		System.out.println("uff,its weekday");
     	}
     	else if(dayname.equals("wednesday")) {
     		System.out.println("uff,its weekday");
     		
     	}
     	else if(dayname.equals("thusrday")) {
     		System.out.println("uff,its weekday");
     		
     	}
     	else if(dayname.equals("friday")) {
     		System.out.println("uff,its weekday");
     		
     	}else if(dayname.equals("saturday")) {
     		System.out.println("Yayy,its weekend");
     		
        }  
     	else {
     		System.err.println("Day Name is invalid");
     	}
     	

     }
	}