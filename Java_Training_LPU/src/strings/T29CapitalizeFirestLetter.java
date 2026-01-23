package strings;

public class T29CapitalizeFirestLetter {

	public static void main(String[] args) {
		String s="hello world naman ravi";
		char[] arr=s.toCharArray();

		for(int i=0;i<arr.length;i++){
			if(i==0 || arr[i-1]==' ') {
				arr[i]=Character.toUpperCase(arr[i]);
				}
			}
		System.out.println(new String(arr));
	}

}
