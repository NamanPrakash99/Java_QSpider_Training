package NonPrimitiveUpcasting;

public class Employee extends Person {
	
	Employee(String name, String address) {
		super(name, address);
	}

	int empid;
	String role;
	
	Employee(String name, String address,int empid,String role){
		super(name,address);
		this.empid=empid;
		this.role=role;
	}
	

}
