package multiarrayassmt;

public class Test {
	public static void main(String[] args) {
		int [][]  arr1 = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
		
		int [][] arr2 = {{1,2,3},
				         {5,6,7},
				         {8,9,9}};
		
		{	
		{
		if(arr1[0][0]==arr2[0][0]) {
			System.out.println(1); }
		else {
			System.out.println(0);
		}
			
		if(arr1[0][1]==arr2[0][1]) {
		System.out.println(1);}
		else {
		System.out.println(0);
		}
		
		if(arr1[0][2]==arr2[0][2]) {
			System.out.println(1);}
			else {
			System.out.println(0);
			}
		
		}
		
		
		{
		if(arr1[1][0]==arr2[1][0]) {
			System.out.println(1);}
			else {
			System.out.println(0);
			}
		if(arr1[1][1]==arr2[1][1]) {
			System.out.println(1);}
			else {
			System.out.println(0);
			}
		if(arr1[1][2]==arr2[1][2]) {
			System.out.println(1);}
			else {
			System.out.println(0);
			}
		
		}
		if(arr1[2][0]==arr2[2][0]) {
			System.out.println(1);}
			else {
			System.out.println(0);
			}
		if(arr1[2][1]==arr2[2][1]) {
			System.out.println(1);}
			else {
			System.out.println(0);
			}
		if(arr1[2][2]==arr2[2][2]) {
			System.out.println(1);}
			else {
			System.out.println(0);
			}
		
		}
	}
	
}