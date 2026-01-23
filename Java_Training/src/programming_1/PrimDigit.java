package programming_1;
import java.util.Scanner;
public class PrimDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int temp=n; 
		boolean flag=false;
		
		while(temp>0) {
			int d=temp%10;
			
			if(d==2 || d==3 ||d==5 || d==7) {
				System.out.println(d+ " Prime digit");
				flag=true;
			}
			temp/=10;
		}
		if(!flag) {
			System.out.println("Not a prime digit");
		}
	}

}
