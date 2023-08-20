package pp2;

public class Forloop3 {

	public static void main(String[] args) {
		int evenSum=0,i;
		for(i=40;i<=80;i++) {
			if(i%2==0) {
				evenSum=evenSum+i;
		//		i=i+2;
			}
		}

		System.out.println("the sum of even Numbewrs is : "+ evenSum );
	}

}
