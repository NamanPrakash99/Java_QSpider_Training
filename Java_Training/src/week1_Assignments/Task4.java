package week1_Assignments;

public class Task4 {

	public static void main(String[] args) {
		double daily_limit=2000;
		double  data_used=1500;
		
		double percentage_used=(data_used/daily_limit)*100;
		System.out.println("Percentageof data used : " + percentage_used);
		
		String res=(data_used>0.9*daily_limit) ? "Data Alert" :"No Alert";
		System.out.println(res);
	}

}
