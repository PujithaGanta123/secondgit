package files;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileInputStream {

	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file name");
		String st=sc.nextLine();
		
		  FileInputStream fi=new FileInputStream();
		
		int i=fi.read();
		while(i!=-1) {
			System.out.println((char)i);
		}
		fi.close();
		sc.close();
		
	}

	}


