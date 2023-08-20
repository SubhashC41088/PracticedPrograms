package multiarrayassmt;
import java.util.Arrays;
public class Arrayassmt7 {
	 public static void swap(int[][] a, int i0, int j0, int i1, int j1) {
	 int temp = a[i0][j0];
	    a[i0][j0] = a[i1][j1];
	    a[i1][j1] = temp;
	 }
	public static void main(String[] args) {
	
		int [][] arr = {{1,2,3},
				        {4,5,6},
				        {7,8,9}};
		
		 System.out.println(Arrays.deepToString(arr));
		    swap(arr,0,0,0,0); // swap a[0][1] with a[2][0] 
		    swap(arr,0,2,2,0);
		    swap(arr,1,0,0,1); 
		    swap(arr,1,1,1,1);
		    swap(arr,1,2,2,1);
		    System.out.println(Arrays.deepToString(arr));

	}
}
