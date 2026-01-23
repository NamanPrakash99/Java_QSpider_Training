package oopsFundamentals;

public class EncapsulationDriver {

	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setPrice(150);
		e.setName("The Atomic habit");
		System.out.println(e.getPrice());
		System.out.println(e.getName());
	}

}
