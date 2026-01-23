package hasarelation;

public class Task9Acc {
	private String name;
	private Task9T history;
	
	Task9Acc(String name){
		this.name=name;
	}
	
	// helper
	
	public void viewHistory() {
		if(history==null) {
			System.out.println("Loading history : "+name);
			history=new Task9T();
		}
		System.out.println(history.getHistory());
	}
	
	public void showdetails() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
