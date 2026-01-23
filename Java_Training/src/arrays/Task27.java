package arrays;

import java.util.Scanner;

public class Task27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// First array input
		int n1=sc.nextInt();
		int [] arr=new int[n1];
		for(int i=0;i<n1;i++) {
			arr[i]=sc.nextInt();
		}
		
		// Second array input
		int n2=sc.nextInt();
		int [] arr1=new int[n2];
		for(int i=0;i<n2;i++) {
			arr1[i]=sc.nextInt();
		}
		
		int [] arr2=new int[arr.length+arr1.length];
		
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			arr2[index++]=arr[i];
		}
		for(int i=0;i<arr1.length;i++) {
			arr2[index++]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+ " ");
		}
		
	
	}

}
