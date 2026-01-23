package WrapperClass;

public class Sample {

	public static void main(String[] args) {
		// to convert primitive data  type
		
//		String s="123Hai";
//		int a=Integer.parseInt(s);
//		System.out.println(a);
		
//		String s1="123";
//		double d=Double.parseDouble(s1);
//		System.out.println(d);
		
		// to convert into wrapper class use valueOf
		
//		String s2="765";
//		Integer i=Integer.valueOf(s2);
//		System.out.println(i);
		
		// converting primitive to string type
		int a2=10;
		String s3=String.valueOf(a2);
		System.out.println(a2);
		System.out.println(s3);
		// Converting wrapper to string type
		Integer i1=101;
		String s4=Integer.toString(i1);
		System.out.println(s4);
	}

}
