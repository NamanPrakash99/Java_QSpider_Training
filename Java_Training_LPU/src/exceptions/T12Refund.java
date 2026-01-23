package exceptions;

public class T12Refund {
	static boolean RefundProcessed=true;
	static boolean TransactionIdValid=true; 
	public static void main(String[] args) {
		try {
			Refund();
		}catch(T12RefundAlreadyProcessedException n) {
			System.out.println(n.getMessage());
		}catch(T12TransactionIdInvalidException n) {
			System.out.println(n.getMessage());
		}
	}
	public static void Refund() throws T12RefundAlreadyProcessedException,T12TransactionIdInvalidException{
		if(!RefundProcessed) {
			throw new T12RefundAlreadyProcessedException("Refund already Processed.");
		}else if(TransactionIdValid) {
			throw new T12TransactionIdInvalidException("Invalid Transaction");
		}else {
			System.out.println("Refund Processed");
		}
	}

}
