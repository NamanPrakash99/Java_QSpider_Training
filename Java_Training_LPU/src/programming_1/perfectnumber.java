package programming_1;

import java.util.Scanner;

public class perfectnumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
		        
        
        int sum=0;
        for(int i = 1; i <= n-1; i++) {
     	   if (n % i == 0) {
     		   sum+=i;
//     		   System.out.print(i + " ");
		                
		        }
		 }
        System.out.println();
        if(sum==n) {
        	System.out.println(n +" is a Perfect number");
        }else {
        	System.out.println(n +" is not a Perfect nu6mber");

        }
	}

}
