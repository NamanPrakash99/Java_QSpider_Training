package Collections;

import java.util.LinkedList;

public class llExample3 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
	    list.add("Hello");
	    list.add("Naman");
	    list.add("Ravi");
	        
	    list.add(10);
	    list.addFirst(5);
	    list.addLast(20);
	    
//        //update
        list.set(4, "Naman");
        System.out.println(list);
	}

}
