package multiarrayassmt;

//import java.util.Scanner;

public class Arrayassmt2 {
	public static void main(String[] args) {
		int m=3,n=3,i,j;
	
		int firstMatrix[][] = {{1,2,3},{4,5,6},{2,2,2}};
		int secondMatrix[][]={{1,2,3},{4,5,6},{3,3,3}};
		int [][] sum = new int[m][n];
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
		
		sum[i][j] = firstMatrix[i][j]+secondMatrix[i][j];
		
			}
		}
		
		System.out.println("Sum of the matrices is :");
		
		for (int[] x : sum) {   
			for (int h : x )   {
				
				System. out. println(h + "  ");
			}
      System. out. println();
		}
		}
	}

		
	

		
		
