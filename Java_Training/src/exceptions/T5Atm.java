package exceptions;

public class T5Atm {
	static int balance=1000;
	static int Correctpin=1234;
	static int atmcash=5000;
	public static void main(String[] args) {
		try {
			withdraw(2000,2345);
		}catch(T5InvalidPinException n) {
			System.out.println(n.getMessage());
		}catch(T5InSufficientBalanceException n) {
			System.out.println(n.getMessage());
		}catch(T5OutOfCashException n) {
			System.out.println(n.getMessage());
		}
	}
	
	public static void withdraw(int amount,int pin) throws T5InvalidPinException,T5InSufficientBalanceException,T5OutOfCashException  {
		if(pin==Correctpin && amount<balance && amount<atmcash) {
			System.out.println("You Can withdraw");
		}else if(pin!=Correctpin) {
			throw new T5InvalidPinException("Incorrect Pin");
		}else if(amount>balance) {
			throw new T5InSufficientBalanceException("InSufficient Balance");
		}else {
			throw new T5OutOfCashException("ATM OUT OF SERVICE");
		}
	}

}
