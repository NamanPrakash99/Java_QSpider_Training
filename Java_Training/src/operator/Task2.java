package operator;

public class Task2 {

	public static void main(String[] args) {
		int acc_bal=50000;
		 String acc_status="active";
		 
		 String  res=(acc_bal>0 && acc_status=="active") ? "Withdrawal allowed" : "Rejected";
		 System.out.println(res);
		 
		 int Withdrawal=700;
		 int ans=(res.equals("Withdrawal allowed")) ? (acc_bal-Withdrawal) :-1;
		 System.out.println(ans);
	}

}
