package DescisionStatement;
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age<12) {
			System.out.println("Ticket price is 100rs");
		}else if(age>12 && age<60) {
			System.out.println("Ticket price is 200rs");
		}else {
			System.out.println("Ticket price is 150rs");
		}
	}

}
