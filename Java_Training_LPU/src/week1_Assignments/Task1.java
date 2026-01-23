package week1_Assignments;

public class Task1 {

	public static void main(String[] args) {
		int math=60;
		int english=50;
		int science=80;
		
		int total_marks=math+english+science;
		System.out.println(total_marks);
		
		String result=(total_marks>=40) ? "Passed" : "Fail";
		System.out.println(result);
	}

}
