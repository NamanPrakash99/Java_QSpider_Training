package Inheritance;

public class Triangle extends Shape {
	double base;
	double height;
	
	Triangle(double base,double height,String type){
		super(type);
		this.base=base;
		this.height=height;
	}
	
	public void display() {
		System.out.println("The area is : "+0.5*base*height);
	}
}
