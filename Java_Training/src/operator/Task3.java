package operator;

public class Task3 {

	public static void main(String[] args) {
		int perf_rating=5;
		int yrs_exp=7;
		boolean disc_action=false;
		
		String eli=(perf_rating>4 && yrs_exp>5 && !(disc_action)) ? "Salary Increment" : "No Increment";
		System.out.println(eli);
	}

}
