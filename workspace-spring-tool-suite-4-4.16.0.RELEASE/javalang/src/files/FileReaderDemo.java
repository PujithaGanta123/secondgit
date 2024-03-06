package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\GAPUJITH\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\javalang\\src\\files\\FileReaderDemo.java");
		FileReader fr=new FileReader(f);//append the text
		BufferedReader br=new BufferedReader(fr);
		int i;
		while((i=fr.read())!=-1) {
			System.out.println((char)i);
		}
		fr.close();
		System.out.println("Finished Reading");
		
	}

}
