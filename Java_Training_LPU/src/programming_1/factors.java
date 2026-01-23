package programming_1;
import java.util.Scanner;
public class factors {

	public static void main(String[] args) {
		   Scanner sc= new Scanner(System.in);
           System.out.print("Enter an integer: ");
           int num = sc.nextInt();
		        
           System.out.print("Factors of " + num + " are: ");

           int sum=0; int product=1;
           for (int i = 1; i <= num; i++) {
        	   if (num % i == 0) {
        		   sum+=i;
        		   product*=i;
        		   System.out.print(i + " ");
		                
		            }
		        }
           System.out.println();
           System.out.println("The sum is : " +sum);
		   System.out.println("The product is: " +product);
           
		    }

}
