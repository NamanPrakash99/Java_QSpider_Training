package exceptions;

public class T8Order {
	static boolean InvalidCoupon=true;
	static boolean PayementGatewayTimeout=true;
	static boolean AddressNotFound=true;
	public static void main(String[] args) {
		try {
			OrderPlaced();
		}catch(T8InvalidCouponException n) {
			System.out.println(n.getMessage());
		}catch(T8PaymentGatewayTimeoutException n) {
			System.out.println(n.getMessage());
		}catch(T8AddressNotFoundException n) {
			System.out.println(n.getMessage());
		}
	}
	
	public static void OrderPlaced() throws T8InvalidCouponException,T8PaymentGatewayTimeoutException,T8AddressNotFoundException {
		if(!InvalidCoupon) {
			throw new T8InvalidCouponException("INVALID COUPON");
		}else if(!PayementGatewayTimeout) {
			throw new T8PaymentGatewayTimeoutException("PAYMENT GATEWAY TIMEOUT");
		}else if(!AddressNotFound) {
			throw new T8AddressNotFoundException("ADDRESS NOT FOUND");
		}else{
			System.out.println("ORDER PLACED SUCCESSFULLY!!");
		}
	}

}
