package programming_1;
import java.util.Scanner;
public class gcd {

	 public static int gcdIterative(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("Gcd of "+ m + " and "+ n + " is : "+gcdIterative(m,n));
	}

}
