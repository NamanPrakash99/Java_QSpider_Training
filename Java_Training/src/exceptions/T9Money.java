package exceptions;

public class T9Money {
	static int balance=10000;
	static boolean NetworkFailure=true;
	static boolean InvalidBenficiary=true;
	
	public static void main(String[] args) {
		try {
			Transfer(4000);
		}catch(T9NetworkFailureException n) {
			System.out.println(n.getMessage());
		}catch(T9InsufficientBalanceException n) {
			System.out.println(n.getMessage());
		}catch(T9InvalidBeneficiaryException n) {
			System.out.println(n.getMessage());
		}
	}
	public static void Transfer(int amount) throws T9NetworkFailureException,T9InsufficientBalanceException,T9InvalidBeneficiaryException  {
		if(!NetworkFailure) {
			throw new T9NetworkFailureException("Network Failre");
		}else if(amount>balance) {
			throw new T9InsufficientBalanceException("InSufficient Amount");
		}else if(!InvalidBenficiary) {
			throw new T9InvalidBeneficiaryException("Invalid Beficiary");
		}else {
			balance-=amount;
			System.out.println("Money Transferred Successfully.\nRemining balance: "+balance);
		}
	}
}
