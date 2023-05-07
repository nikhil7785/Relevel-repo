package Filehandlingtopic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read_data {
	public static void main(String[] args) throws IOException {
		File f=new File("D://NA.txt");
		FileReader fr=new FileReader(f);
		char[]arr=new char[(int)f.length()];
		fr.read(arr);
		String s=new String(arr);
		System.out.println(s);
		
		
	}

}
