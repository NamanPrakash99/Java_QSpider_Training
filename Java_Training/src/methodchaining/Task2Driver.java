package methodchaining;

public class Task2Driver {

	public static void main(String[] args) {
		Task2 t2=new Task2();
		t2.setName("Ravi").setClass_sec("K22GR").setAge(22);
		System.out.println(t2.getName()+ " "+t2.getClass_sec()+ " "+t2.getAge());
	}

}
