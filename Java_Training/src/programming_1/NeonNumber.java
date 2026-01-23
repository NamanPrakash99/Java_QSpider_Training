package programming_1;
import java.util.*;
public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int square = n * n; 
        int sum = 0;
        int m = square;
	   
	    while (m != 0) {
            int digit = m % 10;
            sum += digit;
            m /= 10;
        }
	    if (sum == n) {
            System.out.println(n + " is a Neon Number");
        } else {
            System.out.println(n + " is not a Neon Numbers");
	}
	}

}
