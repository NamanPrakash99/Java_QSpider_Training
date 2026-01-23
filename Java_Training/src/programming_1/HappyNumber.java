package programming_1;
import java.util.Scanner;
public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int temp=n; int d; int sum=0;
		
		while(n>9) {
			while(n>0) {
				d=n%10;
				sum+=d*d;
				n/=10;
			}
			n=sum;
			sum=0;
		}
		if(n==1) {
			System.out.println("Happy Number");
		}else {
			System.out.println("Not happy number");
		}
	}

}
