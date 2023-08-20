package pp1;

public class ConditionalStatements {
	public static void main(String[] args) {
	    String examStatus = "pass";
		if(examStatus == "pass") {
			System.out.println("please wait for the round1");
			
			String round1Status = "pass";
			if(round1Status == "fail") {
				System.out.println("please wait for the round2");
				
				}
			else {
				System.out.println("go to home");
			}
		}
		else {
			System.out.println("go to home");
		}
		
	}

}
