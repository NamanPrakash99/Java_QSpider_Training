package programming_1;
import java.util.Scanner;
public class XylemandPhloem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int inner=0; int outer=0;
		
		while(temp!=0) {
			if(temp==n || temp<10) {
				outer+=temp%10;
			}else {
				inner+=temp%10;
			}
			temp/=10;
		}
		
		if(outer==inner) {
			System.out.println("Xylem number");
		}else {
			System.out.println("Phloem number");
		}
	}

}
