package Encapsulation;

public class Student {
	int s_id;
	String s_name;
	
	Student(int s_id,String s_name){
		this.s_id=s_id;
		this.s_name=s_name;
	}

	public static void main(String[] args) {
		Student s=new Student(101,"Naman");
		accept(s);
	}
	// Method accepting object reference
	public static void accept(Student s1) {
		System.out.println(s1.s_id);
		System.out.println(s1.s_name);

	}

}
