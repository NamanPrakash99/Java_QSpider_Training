package arrays;

import java.util.Scanner;

public class Task32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max = arr[0];

        for (int i = 1; i < n; i += 2) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
	}

}
