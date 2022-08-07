package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestCase2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYMMHHMMSS");  
		   LocalDateTime now = LocalDateTime.now();
		   System.out.println(dtf.format(now));  
		   
		//output stream to select the file create
		File f = new File(System.getProperty("user.dir") + "\\src\\dataFiles\\text_" + dtf.format(now) + ".txt");
		
		//output stream to write files and chaining to the previous step
		FileWriter fw = new FileWriter(f);
		
		//Chaining Buffered writer to write in the file. 
		BufferedWriter bw = new BufferedWriter(fw);
		
		//writing to the text file 
		String name = "Sujit";
		String surname = "S";
		String paragraph = "This is a new file " +
		"which contains the details of how to create a txt file in java";
		bw.write(name);
		bw.write(" ");
		bw.newLine();
		bw.write(paragraph);
		//closing the last stream 
		bw.close();
		System.out.println("The file has been created !!!");
		
		//closing the fiel writer 
		fw.close();

	}

}
