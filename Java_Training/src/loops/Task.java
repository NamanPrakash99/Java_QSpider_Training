package loops;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=' ';
		do {
			System.out.println("Welcome");
			System.out.println("Do u want print again??. Press y for again printing");
			ch=sc.next().charAt(0);
		}while(ch=='y');
	}

}
