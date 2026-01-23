package Polymorphism;

public class Child extends Parent {
	
	static int a=290;
	String name="Ravi";

	static void demo() {
		System.out.println("form child demo....!");
	}
	
	void display() {
		demo();         // child demo
		super.demo();   //parent demo
		
		System.out.println(a);         //child
		System.out.println(super.a);   // parent
		System.out.println(name);       //child
		System.out.println(super.name);  //Parent
	}
	
	public static void main(String[] args) {
		Child c=new Child();
		//c.demo();
		c.display();
	
		// Variable shadowing
		
		
		
	}
	
	
}
