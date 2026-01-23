package DescisionStatement;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		
		if(b>0) {
			System.out.println(b+" is a poitive number");
		}else if(b<0){
			System.out.println(b + " is a negative number");
		}else {
			System.out.println(b +" is a zero number");
		}
	}

}
