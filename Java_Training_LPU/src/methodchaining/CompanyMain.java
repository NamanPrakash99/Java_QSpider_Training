package methodchaining;

public class CompanyMain {

	public static void main(String[] args) {
		Company c=new Company();
		c.setProd_name("T-Shirt").setPrice(750).setDiscount(10).setQuantity(5);
		System.out.println(c.getProd_name()+" "+c.getPrice()+ " "+c.getDiscount()+ " "+c.getQuantity());

	}

}
