package loops;
import java.util.Scanner;
public class task__13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int bal=sc.nextInt();
		while(bal!=0) {
			bal-=100;
		}
		System.out.println(bal);
	}

}
