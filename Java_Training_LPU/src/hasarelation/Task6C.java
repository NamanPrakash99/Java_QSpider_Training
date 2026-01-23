package hasarelation;

public class Task6C {
	private String model;
	private Task6E eng;
	
	Task6C(String model){
		this.model=model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public void CreateEngine() {
		eng=new Task6E("V engine");
	}
	public void showDetails() {
		System.out.println(model);
		System.out.println(eng.getType());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
