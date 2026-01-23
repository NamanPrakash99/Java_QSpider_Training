package oopsFundamentals;

public class Customer {
	int id;
	String name;
	String address;

	Customer(int id){
		this.id=id;
	}
	Customer(int id,String name){
//		this.id=id;
		// ORR
		this(id);
		
		this.name=name;
	}
	Customer(int id,String name, String address){
//		this.id=id;
//		this.name=name; 
		// ORR
		this(id,name);
		
		this.address=address;
	}
	public static void main(String[] args) {
		Customer c=new Customer(101);
		Customer c1=new Customer(101,"Naman");
		Customer c2=new Customer(101,"Naman","Azamgarh");
		
		System.out.println(c.id);
		System.out.println(c1.id +" "+ c1.name);
		System.out.println(c2.id +" "+ c2.name + " "+c2.address);
		
	}

}
