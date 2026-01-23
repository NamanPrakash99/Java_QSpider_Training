package methodchaining;

public class MarkerDriver {

	public static void main(String[] args) {
		// previous method using the creation of object
//		Marker m=new Marker();
//		m.setPrice(1000).setColor("Blue");
//		System.out.println(m.getPrice());
//		System.out.println(m.getColor());
		
		
		// OR 
		
		// Storing inside variable and using it
		String s=(new Marker().setPrice(120).setColor("blue").getColor());
		System.out.println(s);
		
		// OR
		
		// directly printing using printing statements
		System.out.println(new Marker().setPrice(120).setColor("black2").getPrice());
		


	}

}
