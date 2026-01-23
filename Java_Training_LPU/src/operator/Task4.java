package operator;

public class Task4 {

	public static void main(String[] args) {
		double total_amt=40000;
		boolean premium=true;
		boolean firstTime=false;
		
		boolean discount=(total_amt>2000 && premium || !firstTime);
		System.out.println(discount);
		
		double finalAmount=discount ? total_amt*0.9 : total_amt;
		
		total_amt-=(total_amt-finalAmount);
		System.out.println(total_amt);
		
	}

}
