package programming_1;

import java.util.*;

public class sunnyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		
		int m=n+1;
		if(m%Math.sqrt(m)*Math.sqrt(m)==0) {
			System.out.println(m+ " is Sunny number");
		}else {
			System.out.println(m+ " is not Sunny number");

		}
		
	}

}
