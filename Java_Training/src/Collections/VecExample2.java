package Collections;

import java.util.Vector;

public class VecExample2 {

	public static void main(String[] args) {
		Vector v1=new Vector(4);  //  size specified
		v1.add(4);
		v1.add("naman");
		v1.add(9876);
		v1.add("hello");
		System.out.println(v1);
		System.out.println(v1.capacity());
		
		Vector v2=new Vector(4);
		v2.add(8765);
		v2.add("heyyy");
		v2.add(7654);
		v2.add("hello");
		System.out.println(v2);
		System.out.println(v2.capacity());
		
		// new Capacity=old Capacity * 2
		v1.add("hgt");
		v2.add(5678);
		System.out.println(v1);
		System.out.println(v1.capacity());
		
		System.out.println(v2);
		System.out.println(v2.capacity());
	
	}

}
