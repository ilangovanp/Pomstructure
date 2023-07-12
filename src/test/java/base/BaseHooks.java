package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import chainpageobjects.LoginPagechain;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.DateHandler;
import utils.ReadConfig;

public class BaseHooks  {
	
	public  WebDriver driver;
	public Properties p;
	ReadConfig config = new ReadConfig();
	String URL =config.getURL();
	String username=config.getusername();
	String password=config.getpassword();
	DateHandler dt = new DateHandler();


	
	@BeforeMethod
	public void loginCredentials() {
		new LoginPagechain(driver)
		 .username(username)
		 .password(password)
		 .clicklogin();	
	}
	
	
	
	   @BeforeTest
	   @Parameters("browsername")
	   public void browseropening(@Optional("chrome")String browsername) throws IOException {
		
		  
		 if (browsername.equalsIgnoreCase("Chrome")) {
		    WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--disable-notifications");
			options.addArguments("--incognito");
		    driver = new ChromeDriver(options);
		 }else if(browsername.equalsIgnoreCase("firefox")){
		
		
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		 }
		 else if(browsername.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();
		 
		   }
		 
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
				driver.get(URL);
				driver.manage().window().maximize();		
		   
	   }
	 
	   
	   
	   
	   
	   @AfterTest
		public void teardown() {
			driver.quit();
			}
	
	@AfterMethod
	public  void failurescreenshot(ITestResult result) throws IOException {
		
		if(!result.isSuccess()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest= new File("./Screenshot/"+dt.dateCall()+" "+result.getName()+".png");
		    FileUtils.copyFile(src, dest);
				
		}
		
		
		
		
		
	}
	
	
	
	
	

}
