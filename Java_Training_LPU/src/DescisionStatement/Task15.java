package DescisionStatement;
import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String role=sc.nextLine();

		
		if(role.equals("admin") || role.equals("Manager") || role.equals("User")) {
			System.out.println("User is valid\n, Now enter the password");
			String pass=sc.nextLine();
			String currPass=sc.nextLine();
			if(currPass.equals(pass)) {
				System.out.println("User is valid and password is correct");
			}
		}
		
	}

}
