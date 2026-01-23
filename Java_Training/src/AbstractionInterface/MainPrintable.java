package AbstractionInterface;

public class MainPrintable {
public static void main(String[] args) {
	Printable i=new InkJet();
	Printable l=new Laser();
	
	i.print();
	System.out.println(i.getPrintStatus());
	
	l.print();
	System.out.println(l.getPrintStatus());
}
}
