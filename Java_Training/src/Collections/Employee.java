package Collections;

public class Employee {
	int eid;
	String ename;
	
	Employee(int eid,String ename){
		this.eid=eid;
		this.ename=ename;
	}
	
	int GetID() {
		return eid;
	}
	
	String GetName() {
		return ename;
	}
	
	@Override
	public String toString() {
	    return "ID: " + this.eid + " | Name: " + this.ename;
	}

}
