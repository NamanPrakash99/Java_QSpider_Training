package loops;
import java.util.Scanner; 
public class taks_15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int correct_otp=4567;
		int attempt=0;
		int otp;
		
		while(attempt<3) {
			otp=sc.nextInt();
			if(otp==correct_otp) {
				System.out.println("OTP verified");
				break;
			}
			attempt++;	
		}
	}

}
