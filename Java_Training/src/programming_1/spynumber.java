package programming_1;

import java.util.Scanner;

public class spynumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
		        
        int temp=n;
        int sum=0; int product=1;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += lastDigit;          
            product *= lastDigit;      
            temp = temp / 10;          
        }
        
        System.out.println();
        if(sum==product) {
        	System.out.println(n+ " is a spy number");
        }else {
        	System.out.println(n+ " is not a spy number");

        }
	}

}
