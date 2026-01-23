package hasarelation;

public class Task10D {
	private String dname;
	private Task10C[] course; 
	
	Task10D(String dname){
		this.dname=dname;
	}
	
	public void showcourse() {
		if(course==null) {
			System.out.println(dname);
			course=new Task10C[4];
			course[0]=new Task10C("Data Visual");
			course[1]=new Task10C("DSA");
			course[2]=new Task10C("Algo");
			course[3]=new Task10C("C++");

		}
		System.out.println("courses are:");
		for(int i=0;i<course.length;i++) {
			System.out.println(course[i].getCname());
		}
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
	

}
