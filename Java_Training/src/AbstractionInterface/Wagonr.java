package AbstractionInterface;

public class Wagonr extends Car {
	
	Wagonr() {
		super(false,4);
	}
	
	int dist=10;
	int fuel=5;
	int mileage=0;
	public int getMileage() {
		mileage=dist/fuel;
		return mileage;
	}

	public static void main(String[] args) {
		Wagonr wg=new Wagonr();
		System.out.println("the mileage is: "+wg.getMileage());
		wg.getisSedan();
		wg.getSeats();
	}
}
