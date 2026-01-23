package programming_1;

import java.util.Scanner;

public class compositenumberbetweenrange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int lower =sc.nextInt();
		int higher =sc.nextInt();
		
		for (int n = lower; n <= higher; n++) {
            if (n <= 1) continue;
		int count=0;
		for(int i = 2; i < n; i++) {
	     	   if (n % i == 0) {
	     		   count++;
	     	   }
	}
		if(count!=0) {
			System.out.println(n+" is compsoite number ");
		}
	}
	}

}
