package operator;

public class ConditionOperators {

	public static void main(String[] args) {
		
		// With Value 
		int m=10;
		int o=20;
		System.out.println(m>o ? m : o);
		
		
		// with variable 
		int a=10;
		int b=20;
		int g=a>b ? a : b;
		System.out.println(g);
		
		
		// with Expression
		int marks=67;
		int r=(marks>33 ? marks+10 : marks-10);
		System.out.println(r);
		
		
		// With String
		int age=19;
		String s=(age>=18 ? "Eligible" : "Go to Home");
		System.out.println(s);
		
		
		// with Boolean
		boolean n=(10==11 ? true : false);
		System.out.println(n);

	}

}
