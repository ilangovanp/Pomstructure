package utils;

import java.io.File;

import java.io.FileReader;
import java.util.Properties;

public class ReadConfig {
	
	
	 public Properties p;
	
	public ReadConfig()  {
		File f= new File("./src/test/resources/resources/config.properties");
		FileReader fr;
		try {
			
			fr = new FileReader(f);
			p = new Properties();
			p.load(fr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
	public String getURL()  {
		return p.getProperty("url");
		
	}
	
	public String getusername()  {
		return p.getProperty("username");
		
	}
	public String getpassword()  {
		return p.getProperty("password");
		
	}
	
	

}
