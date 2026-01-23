package oopsFundamentals;

public class Biryani {

	public static void main(String[] args) {
		Biryani b1=new Biryani();
		Biryani b2=b1;
		Biryani b3=b2;
		Biryani b4=b3;
		System.out.println(b4==b3);
		
//		mainBiryani b1=new mainBiryani();
//		System.out.println(b1);
	}

}
