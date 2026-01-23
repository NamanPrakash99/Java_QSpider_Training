
public class Task {

	public static void main(String[] args) {
		int a=98;
		int b=91;
		int c=90;
		
//		int n=(a>b) ? a: b;
		int res=(a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);
		System.out.println(res);

		// TO check number is positive,negative or zero

		int p=-7;
		String x=(p>=0) ? ((p>0 ? "Positive" : "Zero")) : "Negative";
		System.out.println("Your number is : "+x);
	}

}
