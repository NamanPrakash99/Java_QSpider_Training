package week1_Assignments;

public class Task11 {

	public static void main(String[] args) {
		int speed=65;
		int speed_limit=60;
		boolean seatbelt_worn=true;
		int fine_amt=0;
		
		String fine=(speed>speed_limit && seatbelt_worn) ? "Fine Imposed" : "No Fine";
		System.out.println(fine);
		
		int finalfine=fine.equals("Fine Imposed") ? fine_amt+20 : fine_amt;
		System.out.println(finalfine);
		
		
		
	}

}
