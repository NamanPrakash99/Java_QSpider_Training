package AbstractionInterface;

// simple class with overridden the methods
class CalciVer1 extends AbstractCalciVer1 {
	public double  power(double d, double d1) {
		return Math.pow(d, d1);
	}
	
	int add(int a, int b) {
		return a + b;
	}
	int sub(int a, int b) {
		return a - b;
	}
	int mul(int a, int b) {
		return a * b;
	}
	
	public static void main(String[] args) {
		double power=new CalciVer1().power(4,3);
		System.out.println(power);
	}
}
