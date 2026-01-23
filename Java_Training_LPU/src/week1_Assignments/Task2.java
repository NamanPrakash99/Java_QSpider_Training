package week1_Assignments;

public class Task2 {

	public static void main(String[] args) {
		int cart_value=5000;
		boolean premium_user=true;
		
		
		String offer_dis=(cart_value>3000 && premium_user) ? "Discount applicable"  : "No Discount";
		System.out.println(offer_dis);
		
		double res=(offer_dis.equals("Discount applicable")) ? cart_value-(cart_value*0.2) : cart_value;
		
		System.out.println("Final amount is :" +res);
		
		
		
	}

}
