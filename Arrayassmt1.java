package multiarrayassmt;
//adding all the index values
import java.util.Scanner;

public class Arrayassmt1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,m,n=0,sum=0;
		System.out.println("Enter the number of rows:");
		 m =sc .nextInt();  
		 System.out.println("Enter the number of colomns:");
		n =sc .nextInt();
		
		int array[][] = new int[m][n];
		System.out.println("Enter the elements:");
		for(i=0;i<m;i++)
		for(j=0;j<n;j++)
		array[i][j] = sc.nextInt();
		System.out.println("Sum of the matrices is :");
		 
		for (i = 0; i < m; i++) {   
			for (j = 0; j < n; j++)   
		  
      for ( i = 0; i < m; i++){ 
    	  for ( j = 0; j < n; j++){ 
    		  sum = sum + array[i][j]; } }
      System. out. print(sum);
      }
	
}
}
