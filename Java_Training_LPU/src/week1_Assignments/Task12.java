package week1_Assignments;

public class Task12 {

	public static void main(String[] args) {
		int age=25;
		boolean no_drink=true;
		boolean no_smoking=true;
		int health_score=8;
		
		String elig=(age>=25 && no_drink && no_smoking && health_score>=8) ? "Premium Applicable" : "Not Applicable";
		System.out.println(elig);
	}

}
