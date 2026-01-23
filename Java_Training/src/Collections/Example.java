package Collections;
import java.util.*;

public class Example {

	public static void main(String[] args) {
		// creating non generic type of ArrayList
		ArrayList a1=new ArrayList();
		

		a1.add("Naman");
		a1.add(2345);
		a1.add(true);
		a1.add("hello");
		a1.add(987654);
		System.out.println(a1);
		
		ArrayList a2=new ArrayList();
		a2.add("haiii");
		a2.add("heyy");
		a2.add(76543);
		System.out.println(a2);
		
		// add all method
		a2.addAll(a1);
		System.out.println(a2);
		
		// add all (int index, collection c)
		a2.addAll(1, a1);
		System.out.println(a2);
		
		// add (int index, data)
		a1.add(1,"Ravi");
		System.out.println(a1);
	}

}
