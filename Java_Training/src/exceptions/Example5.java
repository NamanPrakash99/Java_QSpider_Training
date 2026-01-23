package exceptions;

public class Example5 {
	public static void main(String[] args) {
//		System.out.println("hai........!!");
//		try {
//			int a=10;
//			int b=5;
//			int res=a/b;
//			System.out.println(res);
//		}finally {
//			System.out.println("from finally......!!");
//		}
//		System.out.println("byee..........!");
		
		
		// NESTED TRY
		
		System.out.println("hai........!");
		try {
			try {
				System.out.println(10/0);
			}catch(ArithmeticException n) {
				System.out.println("handled....");
			}catch(NullPointerException n) {
				System.out.println("handled....");
			}
			finally {
				System.out.println("from inner finally...!");
			}
		}finally {
			System.out.println("from outer finally......!");
		}
		System.out.println("byee..........!");
	}
}
