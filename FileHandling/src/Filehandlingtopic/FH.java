package Filehandlingtopic;

import java.io.File;

public class FH {
	public static void main(String[] args) {
		File f=new File("D://Nikhilraje");
		System.out.println(f.mkdir());
		System.out.println(f.exists());
		//System.out.println(f.delete());
		}
}
