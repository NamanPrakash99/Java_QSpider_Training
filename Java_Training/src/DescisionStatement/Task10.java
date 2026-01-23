package DescisionStatement;
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int atten=sc.nextInt();
		if(atten<60) {
			System.out.println("Student has to pay fine");
		}else if(atten>60 && atten<74) {
			System.out.println("Student has to pay light fine");
		}
	}

}
