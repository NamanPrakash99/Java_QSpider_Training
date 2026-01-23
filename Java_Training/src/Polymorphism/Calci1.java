package Polymorphism;

public class Calci1 extends Calci {
	int a=20;
	//override
	public void add() {
//		int a=10;
//		int b=20;
//		System.out.println(a+b);
		System.out.println(30+20);

		
}
	public static void main(String[] args) {
		Calci c=new Calci1();
		c.add();
		System.out.println(c.a);
	}
}
