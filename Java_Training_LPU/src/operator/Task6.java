package operator;

public class Task6 {

	public static void main(String[] args) {
		int speed=120;
		int speed_limit=150;
		boolean driver_emerg=true;
		int fine=0;
		
		boolean apply_fine=(speed>speed_limit && !driver_emerg);
		String res= apply_fine ? "Fine Imposed" : "No Fine";
		System.out.println(res);
		
		fine=apply_fine ? 1000 : 0;
		System.out.println(fine);
	}

}
