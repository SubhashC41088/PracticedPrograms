package multiarrayassmt;
//square the numbers 
public class Arrayassmt4 {
	public static void main(String[] args) {
		int [][] num = {{1,1,1},
				        {2,2,2,},
				        {3,3,3}};		        
	    
		int c[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++){
			c[i][j]=0;{
			c[i][j]=num[i][j]*num[i][j];
			}
	
			System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	
}
}
