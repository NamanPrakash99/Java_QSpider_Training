package loops;
import java.util.Scanner;
public class task_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int pin=sc.nextInt();
		int c_pin=12345;
		
		while(pin!=c_pin) {
			System.out.println("Incorrect pin .Please enter again");
			pin=sc.nextInt();
		}
		System.out.println("Correct pin found");
	}
}
