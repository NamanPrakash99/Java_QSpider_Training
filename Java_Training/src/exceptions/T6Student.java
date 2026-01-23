package exceptions;

public class T6Student {
	static boolean internetConnected = true;
    static boolean sessionActive = true;
    static boolean fileUploaded = true;
    
	public static void main(String[] args) {
		try {
			submitExam();
		}catch(T6InternetDisconnectionException n) {
			System.out.println(n.getMessage());
		}catch(T6SessionTimeoutException n) {
			System.out.println(n.getMessage());
		}catch(T6FileUploadFailureException n) {
			System.out.println(n.getMessage());
		}
	}
	
	public static void submitExam() throws T6InternetDisconnectionException,T6SessionTimeoutException,T6FileUploadFailureException {
		if(!internetConnected) {
			throw new T6InternetDisconnectionException("Internet Disconnected");
		}else  if(!sessionActive) {
			throw new T6SessionTimeoutException("Session Timed Out");
		}else if(!fileUploaded) {
			throw new T6FileUploadFailureException("File Not Uploaded");
		}else {
			System.out.println("Exam Submitted Successfully");
		}
	}

}
