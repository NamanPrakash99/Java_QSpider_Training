package Inheritance;

// inheritance w.r.t to static members
public class Parent {
	
	static {
		System.out.println("hiiii from initializer");
	}
	static int a=10;
	static void demo() {
		System.out.println("from parent demo......!");
	}
	
	public static void main(String[] args) {
	
	}
}
