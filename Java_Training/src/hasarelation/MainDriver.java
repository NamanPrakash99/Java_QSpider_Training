package hasarelation;

public class MainDriver {

	public static void main(String[] args) {
//		Car c=new Car();
//		c.getEngine().setHp(12000);
//		System.out.println(c.getEngine().getHp());
		
		Engine e=new Engine(1200);
		Car c=new Car("Audi",e);
		
//		System.out.println(c.getBrand());
//		System.out.println(e.getHp());
		
		
		c.getEngine().setHp(12000);
		System.out.println(c.getEngine().getHp());
		
		
	}

}
