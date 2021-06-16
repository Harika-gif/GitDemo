package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Globalvaluesdrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\harika\\eclipse-workspace\\TestNGtutorial\\src\\data.properties");
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		//modify property value by set property
		prop.setProperty("browser", "firefox");
		System.out.println(prop.getProperty("browser"));
		
		//it will change in data properties also
		FileOutputStream fos = new FileOutputStream("C:\\Users\\harika\\eclipse-workspace\\TestNGtutorial\\src\\data.properties");
		prop.store(fos, null);
		
	}

}
