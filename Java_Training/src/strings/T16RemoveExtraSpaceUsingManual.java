package strings;

public class T16RemoveExtraSpaceUsingManual {

	public static void main(String[] args) {
		String s="Java is fun";
		String result="";
		boolean space=false;

		for(int i=0;i<s.length();i++){
		char ch=s.charAt(i);
		if(ch==' '){
		if(!space){ 
			result+=ch; 
			space=true; 
			}
		}else{
				result+=ch; 
				space=false;
			}
		}
		System.out.println(result.trim());
	}

}
