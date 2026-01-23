package exceptions;

public class T3Product {
	static int availProd=1000;
	public static void main(String[] args) {
		try {
			buy(1900);
		}catch(T3OutOfStockException n) {
			System.out.println(n.getMessage());
		}
	}
	
	public static void buy(int buy) throws T3OutOfStockException {
		if(buy<availProd) {
			System.out.println("You Can Buy");
		}else {
			throw new T3OutOfStockException("You cannot buy the Products");
		}
	}
}
