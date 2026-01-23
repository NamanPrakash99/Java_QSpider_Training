package Inheritance;

public class RightAngleTriangle extends Triangle {

	RightAngleTriangle(double base, double height) {
        super(base, height, "Right Angle Triangle");
    }
	
	public static void main(String[] args) {
		RightAngleTriangle a=new RightAngleTriangle(44.0,5.0);
		a.display();
		System.out.println(a.type);
		System.out.println(a.height);
		System.out.println(a.base);
		a.display();
		
	}

}
