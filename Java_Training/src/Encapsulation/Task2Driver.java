package Encapsulation;

public class Task2Driver {

	public static void main(String[] args) {

		Task2 account = new Task2();
        account.deposit(1000);
        System.out.println("Balance: " + account.getBalance());
	}
	
}
