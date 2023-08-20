package pp2;

public class Loopassmt4 {
	//printing the prime numbers between 50 to 150
	
	public static void main(String[] args) {
		int i=50,j=150;
		while( i<j) {
			boolean  flag=false;
			for(int k = 2;k<=i/2;++k) {
				if(i%k==0) {
					flag = true;
					break;
				}}
		
		 if (!flag && i != 0 && i != 1)
			System.out.println(i+"");

		 ++i;;
		}
		System.out.println("the printed numbers are prime numbers from the range of 50 to 150");
	}
	
}
