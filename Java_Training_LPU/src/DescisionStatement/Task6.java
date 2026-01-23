package DescisionStatement;
import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		if(a>10 && a<20) {
			System.out.println(a+" is present between 10 and 20");
		}else if(a>10){
			System.out.println(a + " is greater than 10");
		}else {
			System.out.println(a+" a is less than 10");
		}
	}

}
