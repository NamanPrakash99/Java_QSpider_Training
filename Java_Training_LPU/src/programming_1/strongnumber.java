package programming_1;

import java.util.Scanner;

public class strongnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();;


		int i;
	      int factorial,digit;
	      int sum = 0;
	      int temp = n;

	      while(temp != 0) {
	         i = 1;
	         factorial = 1;

	         digit = temp % 10;

	         while(i <= digit) {
	            factorial = factorial * i;
	            i++;
	         }
	         sum = sum + factorial;

	         temp = temp / 10;
	      }

	     
	      if(sum == n)
	         System.out.println(n + " is a strong number");
	      else
	         System.out.println(n + " is not a strong number");
	}

}
