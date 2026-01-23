package week1_Assignments;

public class Task3 {

	public static void main(String[] args) {
		int age=55;
		int monthly_sal=60000;
		int credit_score=700;
		
		String criteria=((age>=21 && age<=60) &&monthly_sal>=25000 && credit_score>=700) ? "Eligible" : "Not Eligible";
		System.out.println(criteria);
	}

}
