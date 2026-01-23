package loops;
import java.util.Scanner;
public class task_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		while(n<0) {
			System.out.println("Negative numebr. Please enter a positive number");
			n=sc.nextInt();
		}
		System.out.println("Positive number entered");
	}

}
