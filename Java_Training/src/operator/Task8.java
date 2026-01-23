package operator;

public class Task8 {

	public static void main(String[] args) {
		String username="naman";
		String pass="8653";
		boolean locked=false;
		double attempt=2;

		boolean success=(username.equals("naman") && pass.equals("8653") && !locked);
		System.out.println(success);
		
		attempt+=success ? 0 : 1;
		
		locked=(attempt>=5) ? true : false;
		
		System.out.println(locked);
	}

}
