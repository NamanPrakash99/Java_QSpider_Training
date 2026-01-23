package methods;
import java.util.Scanner;
public class Task12 {
	
	public static int maximumofTwo(int n, int m) {
		if(n>m) {
			return n;
		}
		else
			return m;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println(maximumofTwo(n,m));
	}

}
