package DescisionStatement;
import java.util.Scanner;
public class Task17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the operation u want  to use(add,mul,sub,div)");
		
		sc.nextLine();
		String ch=sc.nextLine();
		
		if(ch.equals("add")) {
			System.out.println("Addition of "+ a +" and " + b +" : "+ (a+b));
		}else if(ch.equals("sub")) {
			System.out.println("Subtraction of "+ a +" and " + b +" : "+ (a-b));

		}else if(ch.equals("mul")) {
			System.out.println("Multiplication of "+ a +" and " + b +" : "+ (a*b));

		}else if(ch.equals("div")) {
			if(b>0) {
				System.out.println("Division of "+ a +" and " + b +" : "+ (a/b));
			}else {
				System.out.println("Division not possible,don't divide number by 0");

			}
		}
	}

}
