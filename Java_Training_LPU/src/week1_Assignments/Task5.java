package week1_Assignments;

public class Task5 {

	public static void main(String[] args) {
		double total_w_day=30;
		double attendance=21;
		
		double atten_perce=(attendance/total_w_day)*100;
		System.out.println("Attendance percentage : " +atten_perce);
		
	    String res=(attendance>25) ? "Eligible for Exam" : "Not eligible";
	    System.out.println(res);

	}

}
