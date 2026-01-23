package operator;

public class Task1 {

	public static void main(String[] args) {
		int attendance=80;
		int marks=67;
		String result=(marks>=40 && attendance>75) ? "Passed" : "Failed";
		int  finalres=(result.equals("Passed")) ? (marks+5) : marks;
		System.out.println(result);
		System.out.println(finalres);

	}

}
