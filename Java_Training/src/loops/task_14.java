package loops;
import java.util.Scanner;
public class task_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Menu");
            System.out.println("2. Orders");
            System.out.println("3. Exit");
            choice = sc.nextInt();
        } while (choice != 3);
	}

}
