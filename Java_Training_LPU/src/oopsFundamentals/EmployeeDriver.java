package oopsFundamentals;
import java.util.*;
public class EmployeeDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Employee e1=new Employee();
//		e1.eid=sc.nextInt();
		e1.eid=106;
		e1.ename="Naman";
		System.out.println(e1.eid);
		System.out.println(e1.ename);
		
		Employee e2=new Employee();
		e2.eid=109;
		e2.ename="Ravi";
		System.out.println(e2.eid);
		System.out.println(e2.ename);
	}

}
