package methods;

public class Task7 {

	 static double withdraw(double balance, double amount) {
	        if (amount <= balance)
	            return balance - amount;
	        return balance;
	    }

	    public static void main(String[] args) {
	        System.out.println(withdraw(5000, 2000));
	    }

}
