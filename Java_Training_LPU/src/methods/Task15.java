package methods;
import java.util.Scanner;
public class Task15 {
	
	public static void square(int n) {
		System.out.println("Square of "+ n + " is " + n*n);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		square(n);
	}

}
