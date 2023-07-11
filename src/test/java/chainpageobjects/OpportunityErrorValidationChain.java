package chainpageobjects;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class OpportunityErrorValidationChain {
	
	private WebDriver driver;
	
	public OpportunityErrorValidationChain(WebDriver driver){
		
		this.driver=driver;
		
		
	}
	public OpportunityErrorValidationChain clicknavigation() {
		WebElement navigation =driver.findElement(By.xpath("//div[@role='navigation']//button"));
         navigation.click();
		return this;
	}
	
	public OpportunityErrorValidationChain clickViewalllink() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='View All']")));
		WebElement Viewall =driver.findElement(By.xpath("//button[text()='View All']"));
		Viewall.click();
		System.out.println("Viewall");
		return this;
			}
     public OpportunityErrorValidationChain clickSales() {
    	 WebElement sales= driver.findElement(By.xpath("//p[text()='Sales']"));
    	 sales.click();
		return this;
			}
	
     
     public OpportunityErrorValidationChain clickOpportunities() {
    	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    	 WebElement vh=driver.findElement(By.xpath("//a[@title=\"Opportunities\"]"));
   	     Actions sd = new Actions(driver);
   	     sd.moveToElement(vh).build().perform();
   	     
   	
   	  WebElement vh1=driver.findElement(By.xpath("//a[@title=\"Opportunities\"]"));
   		  JavascriptExecutor js = (JavascriptExecutor) driver;
   		  js.executeScript("arguments[0].click();",vh1);
    	 
 		return this;
 			}
     
     public OpportunityErrorValidationChain clickNew() {
    	 WebElement newbutton =driver.findElement(By.xpath("//div[text()='New']")); 
    	 newbutton.click();
 		return this;
 			}
     public OpportunityErrorValidationChain clickdate() {
    	 driver.findElement(By.xpath("//input[@name=\"CloseDate\"]")).click();
    	 WebElement date=driver.findElement(By.xpath("//span[text()='26']"));
    	 date.click();
 		return this;
 			}
     public OpportunityErrorValidationChain clickSave() {
    	 WebElement savebutton= driver.findElement(By.xpath("//button[text()='Save']"));
    	 savebutton.click();
 		return this;
 			}
	
     public String validateErrorMessages() {
    	 
    	String alertmessage = "";
    	 List<WebElement> errormsg=driver.findElements(By.xpath("//ul[contains(@class,'errorsList ')]/li"));
    	 for(int i=0;i<errormsg.size();i++) 
    	 { 
             String alerterror=errormsg.get(i).getText();
    	    System.out.println(alerterror);
    	    alertmessage = alertmessage+" "+alerterror;

    	 }
    	 
    	return alertmessage;
		
     }
			 
		 
	
	
	}
	
	


