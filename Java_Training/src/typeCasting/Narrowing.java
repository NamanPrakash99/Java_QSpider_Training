package typeCasting;

public class Narrowing {

	public static void main(String[] args) {
		int a = 10;
		byte b = (byte) a;
		System.out.println(b);
		
		
		double c = 5.06;
		short d = (short) c;
		System.out.println(d);
		
		int z = 101;
		char o = (char) z;
		System.out.println(o);
		
		
		long f = 8;
		int g = (int) f;
		System.out.println(g);
		
		
		float m = 67.0f;
		int n = (int) m;
		System.out.println(n);
	}

}
