package programming_1;
import java.util.*;
public class TechNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int temp=n;int count=0;int r ;int s = 0;
		
		while(temp!=0) {
			r=n%10;
			count++;
			temp/=10;
		}
		if(count%2==0) {
			int k=n/2;
			int p=(int)Math.pow(10, count);
			int left=temp/p;
			int right=temp%p;
			s=(left+right);
			s=s*s;
		}
		if(s==temp) {
			System.out.println("Tech Number");
		}else {
			System.out.println("Not a Tech number");
		}
	}

}
