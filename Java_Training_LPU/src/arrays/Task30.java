package arrays;

import java.util.Scanner;

public class Task30 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double [] arr=new double[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
            arr[i] = arr[i] + (arr[i] * 0.10);
            System.out.print(arr[i] + " ");
        }
	}

}
