package AbstractionInterface;

public class Laser implements Printable {
	public void print() {
		System.out.println("Laser is printing...!!!");
	}
	
	public String getPrintStatus() {
		return "Laser printing status:completed";
	}
}
