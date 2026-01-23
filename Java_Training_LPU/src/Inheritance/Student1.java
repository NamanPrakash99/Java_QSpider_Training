package Inheritance;

public class Student1 extends Person1 {
	static String name="Ravi";
	int price=200;
	
	public static void main(String[] args) {
		Student1 s=new Student1();
		s.display();
		
	}
	
	void display() {
		System.out.println(name);
		System.out.println(super.name); // super can only used with non static methods
		System.out.println(price);
		System.out.println(super.price);
	}
}
