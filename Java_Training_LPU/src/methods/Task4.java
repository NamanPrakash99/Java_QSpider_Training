package methods;
import java.util.Scanner;
public class Task4 {
	
	static double deposit(double balance, double amount) {
        return balance + amount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n=sc.nextDouble();
        double m=sc.nextDouble();
        System.out.println(deposit(n,m));
    }

}
