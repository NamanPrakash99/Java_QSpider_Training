package Inheritance;

public class Main {

	public static void main(String[] args) {

		// w.r.t to parent className
		
		Super.demo();          // parent static
		// Super.test();       // parent non static
		// Super.demo1();      // child static
		// Super.test1();      // child non static
		System.out.println("************************");
		
		// w.r.t to child className
		Sub.demo();           // parent static
		//Sub.test();         //parent non static
		Sub.demo1();          // child static
		//Sub.test1();        // child non static
		System.out.println("************************");
		
		// w.r.t to Parent object Reference
		Super s=new Super();
		s.demo();            // parent static
		s.test();            //parent non static
		//s.demo1();          // child static
		//s.test1();          // child non static
		System.out.println("************************");
		
		// w.r.t to Child object reference
		Sub sub=new Sub();
		sub.demo();            // parent static
		sub.test();            //parent non static
		sub.demo1();           // child static
		sub.test1();           // child non static
	}

}
