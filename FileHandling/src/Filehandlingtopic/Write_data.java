package Filehandlingtopic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_data {
	public static void main(String[] args) throws IOException {
		File f=new File("D://NA.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("I love you mummy");
	
		fw.write("I love you Bala");
		fw.flush();
		System.out.println("data is written");
	}

}
