package programming_1;
import java.util.Scanner;
public class BuzzNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%10==7 || n%7==0) {
			System.out.println("Tech Number");
		}else {
			System.out.println("Not a tech number");
		}
	}

}
