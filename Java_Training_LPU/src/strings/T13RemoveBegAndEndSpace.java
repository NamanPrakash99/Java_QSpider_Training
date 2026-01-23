package strings;

public class T13RemoveBegAndEndSpace {

	public static void main(String[] args) {
		String s=" Hello ";
		int start=0,end=s.length()-1;

		while(start<=end && s.charAt(start)==' ') {
			start++;
		}
		while(end>=start && s.charAt(end)==' ') {
			end--;
		}
		System.out.println(s.substring(start,end+1));
	}

}
