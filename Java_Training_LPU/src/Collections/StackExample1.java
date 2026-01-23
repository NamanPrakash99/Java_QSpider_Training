package Collections;
import java.util.Stack;

public class StackExample1 {

	public static void main(String[] args) {
		Stack<Integer> s1=new Stack<>();
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(40);
		s1.push(50);
		System.out.println(s1);
		
		System.out.println(s1.pop());
		System.out.println(s1.peek());
		System.out.println(s1.isEmpty());
		
		System.out.println(s1.search(40));
		
	}

}
