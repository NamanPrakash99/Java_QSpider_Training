package oopsFundamentals;

public class Example {

	public static void demo(){
		System.out.println("from demo....!");
	}
	public static void main(String[] args) {
		// in same class we can call it directly
		// in different class - className.refernce
		// Example.demo -- another class    --  class name as reference
		demo();
		Example e=new Example();
		e.demo();
	}

}
