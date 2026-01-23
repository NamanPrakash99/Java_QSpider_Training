package methodchaining;

public class Task2 {
	private String name;
	private int age;
	private String class_sec;
	

	public String getName() {
		return name;
	}


	public  Task2 setName(String name) {
		this.name = name;
		return this;
	}


	public int getAge() {
		return age;
	}


	public Task2 setAge(int age) {
		this.age = age;
		return this;
	}


	public String getClass_sec() {
		return class_sec;
	}


	public Task2 setClass_sec(String class_sec) {
		this.class_sec=class_sec;
		return this;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
