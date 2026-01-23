package hasarelation;

public class TyreDriver {

	public static void main(String[] args) {
		Car1 c=new Car1();
		
		Tyre[] arr = c.getTyres();
		for(int i=0;i<arr.length;i++) {
			System.out.println(c.getTyres()[i].getBrand());
		}
//		System.out.println(c.getTyres()[0].getBrand());
	}

}
