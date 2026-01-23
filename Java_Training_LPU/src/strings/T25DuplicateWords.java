package strings;

public class T25DuplicateWords {

	public static void main(String[] args) {
		String s="java is fun and java is easy";
		String[] words=s.split(" ");
		for(int i=0;i<words.length;i++){
			for(int j=i+1;j<words.length;j++){
				if(words[i].equals(words[j])){
					System.out.print(words[i]+" ");
					break;
					}
				}
			}
	}

}
