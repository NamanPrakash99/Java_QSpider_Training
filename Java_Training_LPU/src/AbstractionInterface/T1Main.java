package AbstractionInterface;

public class T1Main {
public static void main(String[] args) {
	T1Shape c=new T1Circle(10);
	T1Shape r=new T1Rectangle(10,2);
	
	System.out.println("For circle");
	System.out.println(c.calculateArea());
	System.out.println(c.calculatePerimeter());
	
	System.out.println("For rectangle");
	System.out.println(r.calculateArea());
	System.out.println(r.calculatePerimeter());
	
}
}
