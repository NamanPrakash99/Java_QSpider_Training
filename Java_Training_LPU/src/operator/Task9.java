package operator;

public class Task9 {

	public static void main(String[] args) {
		int units=260;
		boolean commercial_user=true;
		
		double bill=(units>300 || commercial_user) ? 12.0 :7.5;
		double total_bill=units*bill;
		total_bill+=0.5;
		System.out.println(total_bill);
		
		
		
	
	}

}
