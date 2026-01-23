package hasarelation;

public class Task4Acc {
	
	private Task4Cust customer;
	private double balance;
	
	Task4Acc(String customer, double balance){
		this.customer=new Task4Cust(customer);
		this.balance=balance;
	}
	
	public void showdetails() {
		customer.display();
		System.out.println("The account balance is : "+balance);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
