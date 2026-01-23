package programming_1;
import java.util.Scanner;
public class EvenOddwithoutModulus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n==(n/2)*2) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}
