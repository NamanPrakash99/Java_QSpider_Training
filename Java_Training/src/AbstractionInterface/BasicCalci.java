package AbstractionInterface;

 class BasicCalci extends AbstractBasicCalci {
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
		int add=new BasicCalci().add(20,30);
		System.out.println(add);
		int sub=new BasicCalci().sub(20,30);
		System.out.println(sub);
		int mul=new BasicCalci().mul(20,30);
		System.out.println(mul);
		
	}

}
