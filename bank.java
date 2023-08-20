package pp1;

public class bank {
	static int  currentBalance = 1000;
	public static void greetCustomer() {
		//METHOD BODY
		System.out.println("Hello, Welcome to the 'Bank of india'");
	}
	
    public static void main(String[] args) {
    	bank bank = new bank();
		greetCustomer();
		System.out.println("currentBalance is :"+bank.checkBalance());
		bank.deposit(5000000);
		System.out.println("currentBalance is :"+bank.checkBalance());
		bank.withdrowal(1400);
		System.out.println("currentBalance is :"+bank.checkBalance());
		bank.checkBalance();
	}
    public void deposit(int amount) {
    	currentBalance = currentBalance + amount;
    }
    public  void  withdrowal(int amount) {
    	currentBalance = currentBalance - amount;
    	System.out.println("Amount withrown succefully..!");
    }
    public int checkBalance() {
    	return currentBalance;
    	
    }
    	
}
