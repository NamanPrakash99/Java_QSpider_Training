package methods;
import java.util.Scanner;
public class Task14 {
	
	public static void multiplicationTable(int n) {
		for(int i=0;i<=10;i++) {
			System.out.println(n+" X " + i + " = "+n*i);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		multiplicationTable(n);
	}

}
