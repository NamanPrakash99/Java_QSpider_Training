package methodchaining;

public class Task3 {
	private String brand;
	private int price;
	private String color;
	private int warranty;
	
	public String getBrand() {
		return brand;
	}
	public Task3 setBrand(String brand) {
		this.brand=brand;
		return this;
	}
	
	public int getPrice() {
		return price;
	}
	public Task3 setPrice(int price) {
		this.price=price;
		return this;
	}
	
	public String getColor() {
		return color;
	}
	public Task3 setColor(String color) {
		this.color=color;
		return this;
	}
	
	public int getWarranty() {
		return warranty;
	}
	public Task3 setWarranty(int warranty) {
		this.warranty=warranty;
		return this;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
