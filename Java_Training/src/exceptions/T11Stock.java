package exceptions;

public class T11Stock {
	static int  stock=50;
	static boolean dataMatched=true;
	static boolean SyncFailure=true; 
	public static void main(String[] args) {
		try {
			OrderStock(-10);
		}catch(T11NegativeStockException n) {
			System.out.println(n.getMessage());
		}catch(T11DataMismatchException n) {
			System.out.println(n.getMessage());
		}catch(T11SyncFailureWithWarehouse n) {
			System.out.println(n.getMessage());
		}
	}
	
	public static void OrderStock(int newstock) throws T11NegativeStockException,T11DataMismatchException,T11SyncFailureWithWarehouse {
		if(newstock<0) {
			throw new T11NegativeStockException("Stock cannot be negative");
		}else if(!dataMatched) {
			throw new T11DataMismatchException("Data Mismatched");
		}else if(!SyncFailure) {
			throw new T11SyncFailureWithWarehouse("Sync failed with the Warehouse");
		}else {
			stock=newstock;
			System.out.println("Stock Updated Successfully"+stock);
		}
	}
}
