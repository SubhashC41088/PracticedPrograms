package foreach;

public class assmt2 {
	public static void main(String[] args) {
		int[] arr = {2,2,2,20,74};

		int sum =0;
		
	for(int i:arr) 
		sum +=i;
			System.out.println(sum/arr.length);
	}
}
