package week1_Assignments;

public class Task7 {

	public static void main(String[] args) {
		int age=22;
		int ticket_pr=250;
		
		String check=((age<12 || age>60))? "Discount Applicable"  : "No Discount";
		System.out.println(check);
		
		double discounted=(check.equals("Discount Applicable")) ? ticket_pr-(ticket_pr*0.3) : ticket_pr;
		
		System.out.println(discounted);
		
	
	}

}
