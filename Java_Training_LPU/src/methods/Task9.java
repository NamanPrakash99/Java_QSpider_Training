package methods;
import java.util.Scanner;
public class Task9 {
	
	public static int TotalMarks(int a, int b, int c) {
		return a+b+c;
	}
	
	public static int calculateGrade(int total) {
		int avg=total/3;
		if(avg>=90) {
			System.out.println("O+");
		}else if(avg>=80) {
			System.out.println("A+");
		}else if(avg>60) {
			System.out.println("A");
		}else if(avg>50) {
			System.out.println("B+");
		}else {
			System.out.println("Work Harder");
		}
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int total=TotalMarks(a,b,c);
		calculateGrade(total);
		
	}

}
