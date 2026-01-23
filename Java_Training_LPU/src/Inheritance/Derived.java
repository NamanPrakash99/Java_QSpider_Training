package Inheritance;

public class Derived extends Base {
	static {
		System.out.println("child is loaded");
	}
	
	static void test() {
		System.out.println("from child test.......!");
	}

	public static void main(String[] args) {
		// when we call parent member 1st
		//  Base.demo();
		
		// child member 1st
		// Derived.test();
		
		// First call child then Parent
		// Derived.test();
		// Base.demo();
		
		// First call Parent then child
		Base.demo();
		Derived.test();
		
	}
}
