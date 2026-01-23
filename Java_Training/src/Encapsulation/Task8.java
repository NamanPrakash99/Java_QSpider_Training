package Encapsulation;

public class Task8 {
	private int amount;
	private int balance;
	
	public void setAmount(int amount) {
		if(amount > 0) {
			this.amount = amount; 
		}
	}
    
	public void setBalance(int balance) {
		if((this.balance - this.amount) > 15000) {
			this.balance = balance;
		}
	}
	
	public int getAmount() {
		return amount;
	}
	
	public int getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		Task8 am = new Task8();
		
		am.balance = 20000; 
		
		am.setAmount(1000);
		
		if (am.getAmount() > 0 && (am.getBalance() - am.getAmount()) > 15000) {
			am.setBalance(am.getBalance() - am.getAmount());
			System.out.println("Withdrawal Successful: " + am.getAmount());
		} else {
			System.out.println("Withdrawal Denied");
		}
        
		System.out.println("Current Balance: " + am.getBalance());
	}
}