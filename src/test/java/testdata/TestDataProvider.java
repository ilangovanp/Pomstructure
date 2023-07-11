package testdata;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import utils.ExcelUtility;

public class TestDataProvider {
	
	
	
	
	@DataProvider(name="hdata")
	public static String[][] hardcorddata() {
		
		String[][] av = {{"hari.radhakrishnan@qeagle.com","Leaf@1234"}
				
		};
		
		return av;
	}
	
	

	@DataProvider(name="datasendingmethod")
	public static String[][] usingdiffexcel() throws IOException {
		
		
	        String[][] ab= ExcelUtility.excelfilereading("seleniumbootexcel");
	        return ab;
	
	
	}

}
