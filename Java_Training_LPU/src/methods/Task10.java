package methods;
import java.util.Scanner;
public class Task10 {
	public static String IsEven(int n) {
		if(n%2==0) {
			return "Even";
		}
		return "Odd";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(IsEven(n));
	}

}
