package operator;

public class Task10 {

	public static void main(String[] args) {
		int score=200;
		int time=30;
		int cmplt_time=20;
		int bonus=0;
		boolean cheated=false;
	
		String cmplt=(score>100 && cmplt_time<time && !cheated) ? "Bonus Point Eligible" : "Not eligible for bonus point";
		System.out.println(cmplt);
		
		int eligibility= cmplt.equals("Bonus Point Eligible") ? bonus+10 : bonus;
		System.out.println("The bonus u are eligible is : "+ eligibility);
		
		score+=eligibility;
		System.out.println(score);
		
	}
}
