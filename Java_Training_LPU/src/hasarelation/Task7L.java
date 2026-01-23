package hasarelation;

public class Task7L {
	private String lname;
	private Task7B[] books;
	
	Task7L(String lname){
		this.lname=lname;
		this.books=new Task7B[3];
	
	}
	//helper
	public void addBooks() {
		books[0]=new Task7B("OOPs Design");
		books[1]=new Task7B("JAVA");

	}
	
	public void showLib() {
		System.out.println("The name of libraray is : "+lname);
		
		for(int i=0;i<books.length;i++) {
			if(books[i]!=null) {
				System.out.println(books[i].getTitle());
			}
		}
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	

}
