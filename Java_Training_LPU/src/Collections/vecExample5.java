package Collections;
import java.util.Vector;
import java.util.Iterator;

public class vecExample5 {

	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		v.add("Naman");
		v.add("ravi");
		v.add("abc");
		v.add("xyz");
		v.add("utkarsh");
		
		// using for Eachs
//		for (String str : v)
//            System.out.print(str + " ");
		
		
		// using Iterator
		Iterator<String> it = v.iterator();

        while (it.hasNext()) {
            String str = it.next();
            System.out.print(str + " ");
        }
	}

}
