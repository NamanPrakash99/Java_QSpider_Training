package exceptions;

public class T10User {
	static String corretusername="naman";
	static String correctpassword="1234";
	static boolean Serverdown=true;
	static boolean Tokenexpired=true;
	public static void main(String[] args) {
		try {
			LoggedIn("naman","1234");
		}catch(T10ServerDownException n) {
			System.out.println(n.getMessage());
		}catch(T10TokenExpiredException n) {
			System.out.println(n.getMessage());
		}catch(T10WrongCredentialsException n) {
			System.out.println(n.getMessage());
		}
	}
	
	public static void  LoggedIn(String username, String password) throws T10ServerDownException,T10TokenExpiredException,T10WrongCredentialsException {
		if(!Serverdown) {
			throw new T10ServerDownException("Server Down Currently");
		}else if(!Tokenexpired) {
			throw new T10TokenExpiredException("Token Expired");
		}else if(!username.equals(corretusername) || !password.equals(correctpassword)) {
			throw new T10WrongCredentialsException("Wrong Credentials");
		}else {
			System.out.println("User Logged IN");
		}
	}
}
