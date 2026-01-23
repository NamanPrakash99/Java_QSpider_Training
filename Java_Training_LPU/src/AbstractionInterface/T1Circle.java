package AbstractionInterface;

public class T1Circle extends T1Shape {
	double radius;
	
	T1Circle(double radius ){
		this.radius=radius;
	}
	
	double calculateArea() {
		return Math.PI*radius*radius;
		
	}
	
	double calculatePerimeter() {
		return 2*Math.PI*radius;
	}
}
