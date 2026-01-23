package Encapsulation;

public class Task6 {
	private int age;

    public void setAge(int age) {
        if (age >= 5 && age<=50) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

	public static void main(String[] args) {

	}

}
