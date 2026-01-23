package methods;

public class Recursive {

	public static void main(String[] args) {
		System.out.println("from main....!");
		main(10,20);
		main('k');
	}
	public static void main(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void main(char c) {
		System.out.println(c);
	}
	
	// explicit call of main method
	// Recursive call
//	public static void add() {
//		String[] a= {"hai","hello"};
//		main(a);
//	}

}
