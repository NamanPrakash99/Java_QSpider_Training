package exceptions;

public class Example4 {
	public static void main(String[] args) {
		System.out.println("hai........!!");
		try {
			System.out.println(10/0);
			System.out.println("from try.....!");   // it will not execute as after error it will jump to catch 
		}catch(ArithmeticException e) {
			System.out.println("handled.....!");
		}catch(NullPointerException e) {
			System.out.println("handled in NullPointer.....!");
		}finally {
			System.out.println("from finally......!!");
		}
		System.out.println("byee..........!");
	}
}
