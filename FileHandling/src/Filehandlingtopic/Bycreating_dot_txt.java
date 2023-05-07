package Filehandlingtopic;

import java.io.File;
//import java.io.FileWriter;
import java.io.IOException;

public class Bycreating_dot_txt {
	public static void main(String[] args) throws IOException {
		File f=new File("D://NA.txt");
		System.out.println(f.createNewFile());
		
		}
}
