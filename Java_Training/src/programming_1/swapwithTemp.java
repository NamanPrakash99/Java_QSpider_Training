package programming_1;
import java.util.Scanner;

public class swapwithTemp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before Swap: a = " + a + ", b = " + b);

		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swapping");
		System.out.println("After Swap: a = " + a + ", b = " + b);
	}

}
