package exceptions;

public class T7Patient {
	
	static boolean PatientId=true;
	static boolean DatabaseConnection=true;
	public static void main(String[] args) {
		try {
			RecordAccess();
		}catch(T7PatientIdException n) {
			System.out.println(n.getMessage());
		}catch(T7DatabaseConnectionFailException n) {
			System.out.println(n.getMessage());
		}
	}
	
	public static void RecordAccess() throws T7PatientIdException,T7DatabaseConnectionFailException {
		if(!PatientId) {
			throw new T7PatientIdException("Patient Id is not present");
		}else if(!DatabaseConnection) {
			throw new T7DatabaseConnectionFailException("Database connection fails");
		}else{
			System.out.println("Database connected and You Can access Patient Id");
		}
	}
}
