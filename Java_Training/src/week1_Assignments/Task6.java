package week1_Assignments;

public class Task6 {

	public static void main(String[] args) {
		int weight=500;
		int quality_score=8;
		
		String cond=((weight>450 && weight<550) && quality_score>=8) ? "Accepted" : "Rejected";
		System.out.println(cond);
	}

}
