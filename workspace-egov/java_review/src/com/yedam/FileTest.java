package com.yedam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.junit.jupiter.api.Test;

public class FileTest {

	@Test
	public void list() {
		File file = new File("D://temp");
		String[] list = file.list();
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
	
	//@Test
	public void delete() {
		File file = new File("D//temp/3-3.jpg");
		file.renameTo(new File("D://temp/3복사.jpg"));
	}
	
//	@Test
//	public void copy() throws Exception {
//		FileInputStream fi = new FileInputStream(new File("D:/temp", "3-3.jpg"));
//		FileOutputStream fo = new FileOutputStream(new File("d:/temp", "복사.jpg"));
//		
//		byte temp;
//		
//		while((temp = fi.read()) != -1) {
//			fo.write(temp);
//		}
//	}
}
