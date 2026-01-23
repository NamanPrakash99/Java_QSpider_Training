package strings;

public class T37MergeStringArrays {

	public static void main(String[] args) {
		String[] a={"A","B"};
		String[] b={"C","D"};

		String[] c=new String[a.length+b.length];
		int k=0;

		for(String x:a) {
			c[k++]=x;
		}
		for(String x:b) {
			c[k++]=x;
		}
		for(String x:c) {
			System.out.print(x+" ");
		}
	}

}
