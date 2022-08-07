package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestCase1 {

		public static void main(String[] args) throws FileNotFoundException, IOException {
			
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\config\\config.properties");
			prop.load(fis);
			System.out.println(prop.getProperty("browserName"));
			System.out.println(prop.getProperty("url"));
			System.out.println(System.getProperty("user.dir"));
		}
}
