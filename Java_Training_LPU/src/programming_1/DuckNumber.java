package programming_1;
import java.util.Scanner;
public class DuckNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n; int count=0; int d;
		
		while(temp>0) {
			d=temp%10;
			if(d==0) {
				count++;
			}
			temp/=10;
		}
		if(count>0) {
			System.out.println("Duck Number");
		}else {
			System.out.println("Not a duck number");
		}
	}

}
