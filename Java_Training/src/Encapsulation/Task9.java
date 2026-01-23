package Encapsulation;

public class Task9 {
	private String password;

    public void setPassword(String password) {
        if (password != null && !password.isEmpty() && password.length() >= 8) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
	public static void main(String[] args) {
		Task9 t=new Task9();
		t.setPassword("naman");
		System.out.println(t.getPassword());
	}

}
