package loops;
import java.util.Scanner;
public class task_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int total=0;
		
		for(int i=1;i<=5;i++) {
			total=total+sc.nextInt();
		}
		System.out.println(total);
	}

}
