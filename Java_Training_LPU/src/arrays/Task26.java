package arrays;

import java.util.Scanner;

public class Task26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		
		int sum=0;
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum of marks is: "+sum);
		int avg=sum/n;
		System.out.println("Average is : "+ avg);
		
		
		 if (avg >= 75) {
			 System.out.println("A");
		 }else if (avg >= 60) {
			 System.out.println("B");
		 }else if (avg >= 35) {
			 System.out.println("C");
		 }else {
			 System.out.println("Fail");
		 }
	}

}
