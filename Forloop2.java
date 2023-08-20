package pp2;

public class Forloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int i,number,count;
		System.out.println("prime numbers from 1 to 100");
		for(number=50;number<=150;number++) {
			count=0;
			for(i=2;i<=number/2;i++) {
				if(number%i==0) {
					count++;
					break;	
				}
			}
		    if(count==0&&number!=1) {
		    	System.out.println(number + "");
		    }
				
			
			
		}
	}

}
