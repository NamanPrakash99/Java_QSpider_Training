package methodchaining;

public class Task3Driver {

	public static void main(String[] args) {
		Task3 t3=new Task3();
		t3.setBrand("Samsung Ultra").setPrice(150000).setColor("Blue").setWarranty(5);
		System.out.println(t3.getBrand()+" "+t3.getColor()+" "+t3.getPrice()+" "+t3.getWarranty());
	}

}
