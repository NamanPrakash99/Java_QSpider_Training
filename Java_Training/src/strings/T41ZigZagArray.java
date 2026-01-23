package strings;

public class T41ZigZagArray {

	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6};
		int i=0,j=a.length-1;

		while(i<=j){
			if(i==j) {
				System.out.print(a[i]);
			}
			else {
				System.out.print(a[i]+" "+a[j]+" ");
				i++; j--;
			}
		}
	}

}
