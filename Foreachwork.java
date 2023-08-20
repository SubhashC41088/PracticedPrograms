package foreach;

public class Foreachwork {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9,0};
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		int sum =0;
		for(int i :arr) {
	
		 sum +=i;
	}
		System.out.println(sum);
		System.out.println(sum/arr.length);
}
}
