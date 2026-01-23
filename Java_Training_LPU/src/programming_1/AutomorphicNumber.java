package programming_1;
import java.util.*;
public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int sq=n*n;
		int temp=n;
		int count=0;
		while(temp>0) {
			count++;
			temp/=10;
		}
		int last=(int)(sq%Math.pow(10,count));
		if(n==last) {
			System.out.println("Automorphic number");
		}else {
			System.out.println("Not Automorphic number");
		}
	}

}
