package hasarelation;

public class Car {
	private String brand;
	private Engine engine;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	Car(String brand,Engine engine){
		this.brand=brand;
		this.engine=engine;
	}
	
	// storing engine ref inside car as a property
	// early instantiation -  initializer
	private Engine e=new Engine(1200);
	
	// getter method to return engine reference
	public Engine getEngine() {
		return e;
	}
	
	// constructor using 
//	public Engine getEngine() {
//		return engine;
//	}
	
	public static void main(String[] args) {
		
	}

}
