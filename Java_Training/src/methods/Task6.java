package methods;

public class Task6 {
	static int totalSal(int sal) {
		return sal;
	}
	static int totalSal(int sal1, int bonus) {
		return sal1+bonus;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(totalSal(50000));
		System.out.println(totalSal(4000,50000));
	}

}
