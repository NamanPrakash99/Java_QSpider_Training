package strings;

public class T181stLetterUpperWithoutSplit {

	public static void main(String[] args) {
		String s="java is fun";
		char[] arr=s.toCharArray();

		for(int i=0;i<arr.length;i++){
		if(i==0 || arr[i-1]==' ') {
			arr[i]=Character.toUpperCase(arr[i]);
		}
	}
		System.out.println(new String(arr));
	}

}
