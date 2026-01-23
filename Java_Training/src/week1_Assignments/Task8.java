package week1_Assignments;

public class Task8 {

	public static void main(String[] args) {
		boolean username=true;
		boolean pass=true;
		boolean otp_ver=true;
		
		String res=(username && pass && otp_ver) ? "Login Success" : "Access Denied";
		System.out.println(res);
	}

}
