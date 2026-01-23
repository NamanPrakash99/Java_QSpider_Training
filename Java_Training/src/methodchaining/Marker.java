package methodchaining;

public class Marker {
	private int price;
	private String color;
	
	public Marker setPrice(int price) {
		this.price=price;
		return this;
		
	}
	public Marker setColor(String color) {
		this.color=color;
		return this;
		
	}
	
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
	

	public static void main(String[] args) {

	}

}
