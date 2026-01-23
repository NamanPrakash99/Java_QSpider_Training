package AbstractionInterface;

public class T1Rectangle extends T1Shape {
	double length;
	double breadth;
	
	T1Rectangle(double length, double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	double calculateArea() {
		return length*breadth;
	}
	double calculatePerimeter() {
		return 2*(length+breadth);
		
	}
	
	
}
