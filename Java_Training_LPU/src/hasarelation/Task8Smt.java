package hasarelation;

public class Task8Smt {
	private String name;
	private Task8S[] sim;
	
	Task8Smt(String name){
		this.name=name;
		this.sim=new Task8S[3];
	}
	
	// helper
	public void createSim() {
		sim[0]=new Task8S("Airtel");
		sim[1]=new Task8S("Jio");
	}
	
	
	public void showDetails() {
		System.out.println("The name is : "+name);
		
		for(int i=0;i<sim.length;i++) {
			if(sim[i]!=null) {
				System.out.println(sim[i].getOp());
			}
		}
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
