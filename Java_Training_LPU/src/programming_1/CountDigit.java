package programming_1;
import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int temp=n;int count=0;
		while(temp!=0) {
			int d=temp%10;
			count++;
			temp/=10;
		}
		System.out.println("No of digit is : " +count);
	}

}
