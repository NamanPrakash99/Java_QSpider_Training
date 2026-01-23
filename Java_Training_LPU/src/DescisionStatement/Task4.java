package DescisionStatement;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		if(a%5==0 && a%3==0) {
			System.out.println(a+" is divisble by 5 and 3 both");
		}else {
			System.out.println(a + " is not divisble by 5 and 3 both");
		}
	}

}
