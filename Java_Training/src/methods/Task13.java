package methods;
import java.util.Scanner;
public class Task13{
	
	public static void eligibleToVote(int n) {
		if(n>18) {
			System.out.println("Eligible To Vote");
		}
		else
			System.out.println("Not Eligible To Vote");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		eligibleToVote(n);
	}

}
