package operator;

public class Task5 {

	public static void main(String[] args) {
		int attendance=78;
		boolean disable=true;
		boolean approved=true;
		int extratime=120;
		
		String res=(disable || attendance<60)&& approved ? "Gets Extra Time" : "No Extra Time";
		
		System.out.println(res);
		
		extratime+=30;
		System.out.println(extratime);
		
		
	}

}
