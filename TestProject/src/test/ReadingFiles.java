package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {
	/*
	 * This program reads file(s) contents and prints them out on the console
	 */

	public static void main(String[] args) throws IOException, FileNotFoundException  {
		// TODO Auto-generated method stub
		File f = new File(System.getProperty("user.dir") + "\\src\\dataFiles\\ReadFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		String line = null;
		while ((line = reader.readLine())!= null) {
			System.out.println(line);
		}
		
		reader.close();
	}

}
