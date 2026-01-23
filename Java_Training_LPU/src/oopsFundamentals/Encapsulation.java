package oopsFundamentals;

public class Encapsulation {
	private int price;
	private String bname;
	
	// SETTER METHOD
	public void setPrice(int price) {
		if(price>0) {
			this.price=price;
		}
		
	}
	public void setName(String bname) {
		this.bname=bname;
	}
	
	// GETTER METHOD
	public int getPrice() {
		return price;
	}
	
	public String getName() {
		return bname;
	}


	public static void main(String[] args) {
//		Encapsulation e=new Encapsulation();
//		e.setPrice(150);
//		e.setName("The Atomic habit");
//		System.out.println(e.getPrice());
//		System.out.println(e.getName());
	}

}
