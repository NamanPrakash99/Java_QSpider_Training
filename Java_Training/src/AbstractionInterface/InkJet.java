package AbstractionInterface;

public class InkJet implements Printable {
	public void print() {
		System.out.println("Inkjet is printing");
	}
	
	public String getPrintStatus() {
		return "InkJet printing status:Completed..!!";
	}
}
