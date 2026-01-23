package hasarelation;

public class TaskCom {
	private Task3C cpu;
    private Task3R ram;
    public TaskCom(String model, int size) {
        this.cpu = new Task3C(model);
        this.ram = new Task3R(size);
    }

    public void showspec() {
    	cpu.display();
    	ram.display();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
