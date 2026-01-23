package exceptions;

public class T2Temperature {
	public static void main(String[] args) {
		try {
			temp(-80);
		}catch(T2TemperatureOutOfRangeException n) {
			System.out.println(n.getMessage());
		}
	}
	
	public static void temp(int temp) throws T2TemperatureOutOfRangeException {
		if(temp<-50 || temp>100) {
			throw new T2TemperatureOutOfRangeException("Temperature is beyond limits.");
		}else {
			System.out.println("Temperature is good");
		}
	}
}
