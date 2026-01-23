package programming_1;
import java.util.*;
public class armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int num=n;
		int digit=0;
		while(num>0) {
			digit++;
			num/=10;
		}
		int val=n;
		int sum=0;
		while(val>0) {
			int res=val%10;
			sum+=Math.pow(res, digit);
			val/=10;
		}
		if(sum==n) {
			System.out.println(n+" is armstrong number");
		}
	}

}
