package week1_Assignments;

public class Task9 {

	public static void main(String[] args) {
		int marks=88;
		int f_income=200000;
		boolean sprts_quota=true;
		boolean Ncc_cert=true;
		
		String elig=(marks>=85 && f_income<300000 &&(sprts_quota || Ncc_cert)) ? "Eligible" : "Not Eligible";
		System.out.println(elig);
		
	}

}
