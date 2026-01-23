package AbstractionInterface;

 class CalciVer2 extends AbstractCalciVer2 {
	 double square(double d) {
		return d*d;
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
		double square=new CalciVer2().square(4.0);
		System.out.println(square);
	}
}
