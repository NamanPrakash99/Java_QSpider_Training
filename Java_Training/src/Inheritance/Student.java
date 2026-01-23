package Inheritance;

public class Student extends Person {
	int sid;
	Student(String name,int sid){
		super(name);
		this.sid=sid;
	}
	Student(){
		
	}
	
	public static void main(String[] args) {
		Student s=new Student("Ravi",101);
		System.out.println(s.name);
		System.out.println(s.sid);
	}

}
