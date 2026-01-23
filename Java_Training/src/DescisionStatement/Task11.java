package DescisionStatement;
import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String b=sc.nextLine();
		
		if(b.length()<6) {
			System.out.println("Password is weak");
		}else if(b.length()>6 && b.length()<9) {
			System.out.println("Password is Medium");

		}else {
			System.out.println("Password is Strong");

		}
	}

}
