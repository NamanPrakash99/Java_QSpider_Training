package programming_1;
import java.util.Scanner;


public class FibonacciSerieswithgivenRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        long min = sc.nextLong();
        System.out.print("Enter end: ");
        long max = sc.nextLong();

        long a = 0;
        long b = 1;
        
        System.out.println("Fibonacci Series:");

        while (a <= max) {
            if (a >= min) {
                System.out.print(a + " ");
            }

            long c = a + b;
            a = b;
            b = c;
        }
	}
}
