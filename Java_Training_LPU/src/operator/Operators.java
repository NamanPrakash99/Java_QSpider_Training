package operator;

public class Operators {

	public static void main(String[] args) {
		
		// LOGICAL AND
		System.out.println('a'>=97 && 'a'=='b');
		System.out.println('a'>=97 && 'a'!='b');
		System.out.println('a'<=97 && 'a'=='b');
		System.out.println();
		
		// LOGICAL OR
		System.out.println('a'<97  || 'a'=='b');
//		System.out.println('a'>=97 || 'a'=='b');
//		System.out.println('a'>=97 || 'a'!='a');
		System.out.println();
		
		// LOGICAL NOT
		System.out.println(!(100>='a'&&'a'=='b'));
//		System.out.println(!(6%2==0));
		System.out.println(!(6/2==0));
		System.out.println();

		// LOGICS 
		
		String str="campus";
		boolean res=!str.equals("puma") || (!str.equals("Nike"));
		System.out.println(res)
;	}

}
