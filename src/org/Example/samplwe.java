package org.Example;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class samplwe {
	private static final PrintStream FileUtils = null;

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\new\\new");
		boolean b = f.mkdirs();
		System.out.println(b);
		File f1 = new File("D:\\\\new\\\\new\\bhuvi.txt");
		boolean c = f1.createNewFile();
		System.out.println(c);
		boolean d = f1.isFile();
		boolean e = f1.isHidden();
		boolean g = f.isDirectory();
		System.out.println(d);
		System.out.println(e);
		System.out.println(g);
		FileUtils.write();
	

		
}
}