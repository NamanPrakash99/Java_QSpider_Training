package loops;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the starting character");
		char start=sc.next().charAt(0);
		
		System.out.println("Enter the Ending character");
		char end=sc.next().charAt(0);
		
		for(char ch=start;ch<=end;ch++) {
			if((int)ch%2==0) {
				System.out.println(ch + "->" +(int)ch);
			}
		}
	}

}
