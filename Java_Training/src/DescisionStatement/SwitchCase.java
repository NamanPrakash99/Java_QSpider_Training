package DescisionStatement;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		
		switch(a){
		case "Mon":{
			System.out.println("Breakfast is : Dosa");
		} break;
		case "Tue":{
			System.out.println("Breakfast is : Idly");
		} break;
		case "Wed":{
			System.out.println("Breakfast is : Paratha");
		}break;
		case "Thu":{
			System.out.println("Breakfast is : Paneer Bhurji");
		}break;
		case "Fri":{
			System.out.println("Breakfast is : Sandwhich");
		}break;
		case "Sat":{
			System.out.println("Breakfast is : Aloo Paratha");
		}break;
		case "Sun":{
			System.out.println("Breakfast is : Gobhi Paratha");
		}
		}
		
	}

}
