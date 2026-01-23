package oopsFundamentals;

public class BookkDriver {

	public static void main(String[] args) {
		Bookk b1=new Bookk("harry Potter");
		Bookk b2=new Bookk("Stranger Things");
		
		b1.count=3;
		
		Bookk b3=new Bookk("Resident Evil");
		System.out.println(b3.count);
		System.out.println(b2.count);
		
		System.out.println(b1.title);
		System.out.println(b2.title);
		System.out.println(b3.title);
	}

}
