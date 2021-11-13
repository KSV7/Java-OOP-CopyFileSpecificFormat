package com.gmail.kutepov89.sergey;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		MyFileFilter mFF = new MyFileFilter("doc");
		File folder = new File("/home/ksv/Documents");
		File[] fileList = folder.listFiles(mFF);
		for (File file : fileList) {
			File in = file;
			File out = new File(file.getName());
			try {
				FileOperation.fileCopy(in, out);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
