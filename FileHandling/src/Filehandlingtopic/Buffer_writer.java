package Filehandlingtopic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class Buffer_writer {
	public static void main(String[] args) throws IOException {
		File f=new File("D://NA.txt");
		FileWriter fw =new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("Good");
		bw.newLine();
		bw.write("Morning");
		bw.flush();
		System.out.println("data is added");
		
		
	}

}
