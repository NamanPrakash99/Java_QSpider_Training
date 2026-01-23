package Collections;
import java.util.Collections;

import java.util.ArrayList;

public class EmployeeDriver {

	public static void main(String[] args) {
		ArrayList<EmployeeCompare> e=new ArrayList<>();
		e.add(new EmployeeCompare(101,"Ravi"));
		e.add(new EmployeeCompare(106,"Naman"));
		e.add(new EmployeeCompare(108,"Dingi"));
		e.add(new EmployeeCompare(104,"Dingi"));
		System.out.println("Before Sorting");
		for(EmployeeCompare c:e) {
			System.out.println(c);
		}
		
		Collections.sort(e);
		System.out.println("After Sorting:");
		for(EmployeeCompare c:e) {
			System.out.println(c);
		}
		
	}

}
