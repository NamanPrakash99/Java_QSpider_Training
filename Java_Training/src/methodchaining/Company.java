package methodchaining;

public class Company {

	private String prod_name;
	private int price;
	private int discount;
	private int quantity;
	
	public String getProd_name() {
		return prod_name;
	}

	public Company setProd_name(String prod_name) {
		this.prod_name = prod_name;
		return this;
	}

	public int getPrice() {
		return price;
	}

	public Company setPrice(int price) {
		this.price = price;
		return this;
	}

	public int getDiscount() {
		return discount;
	}

	public Company setDiscount(int discount) {
		this.discount = discount;
		return this;
	}

	public int getQuantity() {
		return quantity;
	}

	public Company setQuantity(int quantity) {
		this.quantity = quantity;
		return this;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
