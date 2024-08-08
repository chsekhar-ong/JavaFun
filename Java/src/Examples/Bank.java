package Examples;

public class Bank {
	
	static int currentBalance =2500;
	public static void main(String[] args) {
		welcome();
		balance();
		Bank bank=new Bank();
		bank.deposit(32000);
		bank.withdrawal(2100);
		System.out.println(bank.getBalance());
		
		
		
		
	}
	public static void welcome() {
		System.out.println("Welcome to ABC Bank");
	}
    public static void balance() {
    	System.out.println("Your current account balance  is:"+currentBalance);
    	
    	
    }
    public void deposit(int amount) {
    	
    	currentBalance=currentBalance+amount;
    	System.out.println("Amount is Deposited successfully currentBalance is:"+currentBalance);
    }
    public void withdrawal(int amount) {
    	
    	currentBalance=currentBalance-amount;
    	System.out.println("Amount Withdrawal is successful currentBalance is:"+currentBalance);
    }
    public int getBalance() {
    	return currentBalance;
    	
    }
}
