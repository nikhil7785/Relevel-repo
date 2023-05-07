package Filehandlingtopic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buffer_Reader {
	public static void main(String[] args) throws IOException {
		File f= new File("D://NA.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String s=br.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s=br.readLine();
		}
	}

}
