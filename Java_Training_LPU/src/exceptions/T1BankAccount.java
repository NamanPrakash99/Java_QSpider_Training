package exceptions;

public class T1BankAccount {

	static int balance=1000;
	
	public static void main(String[] args) {
		try {
			withdrawl(1500);
		}catch(T1InsufficientBalanceException n) {
			System.out.println(n.getMessage());
		}
	}
	
	public static void withdrawl(int withdrawl) throws T1InsufficientBalanceException {
		if(withdrawl<balance) {
			System.out.println("Withdrawl Accepted ");
		}else {
			throw new T1InsufficientBalanceException("You Cannot Withdraw.");
		}
	}

}
