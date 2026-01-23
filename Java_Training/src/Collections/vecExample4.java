package Collections;
import java.util.Vector;

public class vecExample4 {

	public static void main(String[] args) {
		Vector<Integer> v1=new Vector<>();
		v1.add(45);
		v1.add(87);
		v1.add(22);
		v1.add(56);
		System.out.println(v1);
		
		Vector<Integer> v2=new Vector<>(v1);   // using the collection it will add the elements of first one
		v2.add(44);
		v2.add(55);
		System.out.println(v2);
		
	}

}
