package org.te;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;

public class FileOP {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Sabari\\Documents\\NewFolder\\Java\\Selenium\\File.nb");
		
//		//To create a directory/folder
//		boolean mkdir = f.mkdir();
//		System.out.println(mkdir);
//		
//		//To create multiple Directories/Folder
//		boolean mkdirs = f.mkdirs();
//		System.out.println(mkdirs);
//		
//		boolean createNewFile = f.createNewFile();
//		System.out.println(createNewFile);
//		
//		boolean file = f.isFile();
//		System.out.println(file);
//		
//		boolean directory = f.isDirectory();
//		System.out.println(directory);
//		
//		boolean canRead = f.canRead();
//		System.out.println(canRead);
//		
		boolean canWrite = f.canWrite();
		System.out.println(canWrite);
		
		boolean canExecute = f.canExecute();
		System.out.println(canExecute);
		
		FileUtils.write(f, "//Python", true);
		System.out.println("done");
		
		System.out.println("Using Read lines..");
		
		//To read the values as a list
		
		
		
		
		
		
		
	}

}
