package AbstractionInterface;

public class VMain {
public static void main(String[] args) {
	Vehicle c=new VCar();
	Vehicle b=new VBike();
	
	c.start();
	System.out.println(c.getFuelType());
	c.stop();
	
	
	b.start();
	System.out.println(b.getFuelType());
	b.stop();
}
}
