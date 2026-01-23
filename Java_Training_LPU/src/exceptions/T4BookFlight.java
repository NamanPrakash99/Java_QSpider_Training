package exceptions;

public class T4BookFlight {
	static int availSeat=1000;
	
	public static void main(String[] args) {
		try {
			reqSeat(3000);
		}catch(T4SeatUnavailableException n) {
			System.out.println(n.getMessage());
		}
	}
	
	public static void reqSeat(int reqSeat) throws T4SeatUnavailableException {
		if(reqSeat<availSeat) {
			System.out.println("You can book a seat");
		}else {
			throw new T4SeatUnavailableException("You Cannot book a seat");
		}
	}

}
