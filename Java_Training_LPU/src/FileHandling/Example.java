package FileHandling;
import java.io.*;

public class Example {
	public static void main(String[] args) throws IOException {
		
		// create folder using File Class
		File f=new File("D:FileHandling");
		f.mkdir();     //to create new folder
		File f1=new File(f,"Example.java");
		f1.createNewFile();
		File f2=new File(f,"Hello.java");
		f2.createNewFile();
		f2.delete();
		
		File f3=new File(f,"Sample2.java");
		f3.delete();
		
		// to write the data -->File Writer
//		FileWriter fw=new FileWriter(f1);
//		fw.write("Hello Guyzzz..... Welcome to java Class");
//		fw.write("\n");
//		fw.write("Bye Guyzz....... Bye to java");
//		fw.close();
		
		// use BufferedWriter for more efficiency
		BufferedWriter bw=new BufferedWriter(new FileWriter(f1));
		bw.write("class Example{ ");
		bw.newLine();
		bw.write("int marks=90;");
		bw.newLine();
		bw.write("String name=Naman;\n");
		bw.write("}");	
		bw.close();
		
		
		// to read the data from the file
//		FileReader fr=new FileReader(f1);
//		int read;
//		while((read=fr.read())!=-1) {        // -1-->represent end of file
//			System.out.print((char)read);
//		}
		
		// to read the data from the file using BufferdReader
//		BufferedReader br=new BufferedReader(new FileReader(f1));
//		String reading;
//		while((reading=br.readLine())!=null) {      //ReadLine-->it will read line by line in java sourecFile
//			System.out.println(reading);
//		}
//		br.close();
		
		// create folder and sub folder at same time
//		File f1=new File("D:FileHandling\\Hello");
//		f1.mkdirs();
		// Create sub folder
//		File f2=new File(f,"Handling");
//		f2.mkdirs();    // to create a sub folder inside a folder
		
		
		// Create File using File Class
//		File f1=new File(f,"Sample.java");
//		f1.createNewFile();
//		
//		File f2=new File(f,"Sample2.java");
//		f2.createNewFile();
//		
//		File f3=new File(f,"Sample3.java");
//		f3.createNewFile();
		
		// to print all the file names present inside part
		// we use list file which return file type array
//		File[] folder=f.listFiles();
//		if(folder!=null) {
//			for(File f4:folder) {
//				System.out.println(f4.getName());
//			}
//		}
		
		// to check the file locations
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f1.getAbsolutePath());
//		System.out.println(f2.getAbsolutePath());
//		System.out.println(f3.getAbsolutePath());
		
		
		
		
	}
}
