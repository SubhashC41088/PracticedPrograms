package pp2;

import java.util.Scanner;

public class Loopassmt5 {
	public static void main(String[] args){ 
	
//   
//	int i=40;
//	
//	while( i<=80) {
//	System.out.println(i); 
//      i=i+2; 
//     i=i++;
//     
//   
//	
//	} import java.util.Scanner;


//	private static Scanner sc;
//	public static void main(String[] args) 
//	{
//		int number, i = 2, evenSum = 0;
//		sc = new Scanner(System.in);
//		
//		System.out.print(" Please Enter any Number : ");
//		number = sc.nextInt();	
//		
//		while(i <= number)
//		{
//			evenSum = evenSum + i; 
//			i = i + 2;
//		}
//		System.out.println("\n The Sum of Even Numbers upto " + number + "  =  " + evenSum);
//	}
//		int number, i = 2, evenSum = 0;
//		Scanner Sc = new Scanner(System.in);
//		
//		System.out.print(" Please Enter any Number : ");
//		number =Sc.nextInt();	
		int i=0;
		int evenSum=0;
		System.out.println("Enter the number upto getting even numbers sum:");
		Scanner j =new Scanner(System.in);
		int n = j.nextInt();
		j.close();
		while(i <=n)	
		{
			evenSum = evenSum + i; 
			i = i + 2;
		}
		System.out.println("\n The Sum of Even Numbers =  " + evenSum);
		
}

}