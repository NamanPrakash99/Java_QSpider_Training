package oopsFundamentals;

public class Test {
static int a;
	public static void main(String[] args) {
		System.out.println(a); //directly
		System.out.println(Test.a); //clssname
		
		Test t=new Test();
		System.out.println(t.a); // object reference
	}

}
