package DescisionStatement;
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int balance=sc.nextInt();
		int withdrawal=sc.nextInt();
		
		if(balance>=withdrawal && withdrawal%100==0) {
			System.out.println("Withdrwal allowed");
		}else {
			System.out.println("Withdrawl not permitted");
		}
	}

}
