package hasarelation;

public class Car1 {
	private String color;
	

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

	// achieving has a
	private Tyre[] tyres= {new Tyre("MRF"), new Tyre("CEAT"), new Tyre("MICHELIN"),new Tyre("APOLLO")};
	
	// getter for tyres
	public Tyre[] getTyres() {
		return tyres;
	}

	public static void main(String[] args) {
		
	}

}
