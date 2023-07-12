package chainpageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseHooks;
import io.github.bonigarcia.wdm.WebDriverManager;
import testsuites.Testcase_Worktype;
import utils.ReadConfig;

public class WorkTypechain extends  BaseHooks{
	WebDriver driver; 

	public WorkTypechain(WebDriver driver) {
	
		this.driver=driver;
		
		}
	
	
	public WorkTypechain clicknavigation() {
		
		//WebElement navigation =driver.findElement(By.xpath("//div[@role='navigation']//button"));
		WebElement navigation =driver.findElement(By.xpath(p.getProperty("navigation.xpath")));
         navigation.click();
		return this;
	}
	
	public WorkTypechain clickViewalllink() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='View All']")));
		WebElement Viewall =driver.findElement(By.xpath("//button[text()='View All']"));
		Viewall.click();
		System.out.println("Viewall");
		return this;
			}
	
	public WorkTypechain clickworktypelink() {
		WebElement Wt=driver.findElement(By.xpath("//p[text()='Work Types']"));
		WebElement worktype=driver.findElement(By.xpath("//p[text()='Work Types']"));
		 Actions a = new Actions(driver);
		 a.scrollToElement(worktype).build().perform();
		Wt.click();
		return this;
			}
	public WorkTypechain clicknewbutton() {
		WebElement Newbutton =driver.findElement(By.xpath("//div[text()='New']"));
		Newbutton.click();
		return this;
			}
	
	public WorkTypechain typeworktypename(String  typeworktypename) {
		WebElement Worktypename=driver.findElement(By.xpath("(//span[text()='Work Type Name']//following-sibling::span//following::input)[1]"));
		Worktypename.sendKeys(typeworktypename);
		return this;
			}
	public WorkTypechain typedescription(String  typedescription) {
		WebElement description =driver.findElement(By.xpath("//span[text()='Description']//following::textarea"));
		description.sendKeys(typedescription);
		return this;
			}
	public WorkTypechain typeoperatinghours(String typeoperatinghours) {
		WebElement operatinghours=driver.findElement(By.xpath("//input[@title=\"Search Operating Hours\"]"));
		operatinghours.sendKeys(typeoperatinghours);
		return this;
			
	}
	public WorkTypechain typeestimatedhours(String typeestimatedhours ) {
		WebElement estimatedhours=driver.findElement
				(By.xpath("(//span[text()='Estimated Duration']//following-sibling::span//following::input)[1]"));
		estimatedhours.sendKeys(typeestimatedhours);
		return this;
			
	}
	public WorkTypechain clicksavebutton() {
		WebElement savebutton=driver.findElement(By.xpath("//button[@title='Save']"));
		savebutton.click();
		return this;
			
	}
	public String getcreatedmessage() {
		WebElement createdmessage=driver.findElement(By.xpath("//span[@data-aura-class=\"forceActionsText\"]"));
		return createdmessage.getText();
			
	}
  


}
