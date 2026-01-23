package DescisionStatement;
import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int marks=sc.nextInt();
		int family_income=sc.nextInt();
		
		if(marks>=85 && family_income<=300000) {
			System.out.println("Scholarship Allowed");
		}else {
			System.out.println("No Scholarship Allowed");
		}
	}

}
