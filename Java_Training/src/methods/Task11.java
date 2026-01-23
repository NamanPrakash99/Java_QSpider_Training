package methods;
import java.util.Scanner;

public class Task11 {

    public static int calculateSalary(int sal) {
        return sal;
    }

    public static void displayDetail(String name, int salary) {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int sal = sc.nextInt();

        int finalSalary = calculateSalary(sal);
        displayDetail(name, finalSalary);
    }
}
