package multiarrayassmt;

public class Arrayassmt0 {
	public static void main(String[] args) {
//		int[][] arr = {
//				{1,2},
//				{3,4},
//				{5,6} 
//		};
////				new int[3][2];
////		//int i=0,j=0;
////		arr[0][0]=1;
////		arr[0][1]=2;
////		
////		arr[1][0]=3;
////		arr[1][1]=4;
////		
////		arr[2][0]=5;
////		arr[2][1]=6;
//	//	System.out.println(arr[0][0]);
//	//	System.out.println(arr[0][1]);
//		
//		for(int i=0;i<arr.length;i++) {
//			int[] singleRow=arr[i];
//			for(int j=0;j<singleRow.length;j++) {
//				System.out.println(singleRow[j]+ "  ");
//			}
//			System.out.println();
//		}
		int [][] arr= new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[4];
		
		arr[0][0]=11;
		arr[0][1]=12;
		//arr[0][2]=1;
		
		arr[1][0]=23;
		arr[1][1]=24;
		arr[1][2]=25;
		//arr[1][3]=1;
		
		arr[2][0]=36;
		arr[2][1]=37;
		arr[2][2]=48;
		arr[2][3]=39;
		//arr[2][4]=10;
		
		for(int i=0;i<arr.length;i++) {
			int[] singleRow =arr[i];
			for(int j=0;j<arr[i].length;j++) {
				
		System.out.println(arr[i][j]+ " ");
		//int sum =+ arr[i][j];
	//	System.out.println(sum);	
		}
		
		System.out.println();	
		//
		//
	}
		
	}
}
