package Encapsulation;

public class Customerr {
int cid;
String cname;
Customerr(int cid, String cname){
	this.cid=cid;
	this.cname=cname;
}
	public static void main(String[] args) {
		Customerr c=returnn();
		System.out.println(c.cid);
		System.out.println(c.cname);
	}
	// Method returning the object reference5
	public static Customerr returnn() {
//		Customerr c=new Customerr(111,"Ravi");
//		return c;
		// OR
		
		return new Customerr(121,"Ravi");
	}

}
