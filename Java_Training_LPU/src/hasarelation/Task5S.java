package hasarelation;

public class Task5S {
	private String sname;
	private Task5P principal;
	
	Task5S(String sname, String principal){
		this.sname=sname;
		this.principal=new Task5P(principal);
	}
	
	public void displaydetail() {
		System.out.println("The name of school is: "+sname);
		principal.display();
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
