package operator;

public class Task7 {

	public static void main(String[] args) {
		int stock=8;
		boolean fastmoving=true;
		
		boolean check=(stock<10 || fastmoving);
		System.out.println(check);
		
		stock+=check ? 20 : 0;
		System.out.println(stock);
	}

}
