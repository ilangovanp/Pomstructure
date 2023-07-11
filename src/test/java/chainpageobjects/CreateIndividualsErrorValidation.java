package chainpageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Argument;

public class CreateIndividualsErrorValidation {
	private WebDriver driver;
	
	public CreateIndividualsErrorValidation(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public CreateIndividualsErrorValidation clicknavigation() {
		WebElement navigation =driver.findElement(By.xpath("//div[@role='navigation']//button"));
         navigation.click();
		return this;
	}
	
	public CreateIndividualsErrorValidation clickViewalllink() {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='View All']")));
		WebElement Viewall =driver.findElement(By.xpath("//button[text()='View All']"));
		Viewall.click();
		System.out.println("Viewall");
		return this;
			}

   public CreateIndividualsErrorValidation clickIndividualslink() {
	WebElement individual=driver.findElement(By.xpath("//p[text()=\"Individuals\"]"));
	Actions a = new Actions(driver);
	a.scrollToElement(individual).build().perform();
	driver.findElement(By.xpath("//p[text()=\"Individuals\"]")).click();
		
		return this;
			}
		
   public CreateIndividualsErrorValidation clickIndividualdropdownicon() {
	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   WebElement dp= driver.findElement(By.xpath("(//a[@title=\"Individuals\"]//following::one-app-nav-bar-menu-button)[1]"));
		dp.click();
		
		return this;
				}	
   public CreateIndividualsErrorValidation clickNewIndividual() {
	   driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	   
	   WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Individual']")));
		WebElement nwi=driver.findElement(By.xpath("//span[text()='New Individual']"));
		Actions act = new Actions(driver);
		act.moveToElement(nwi).click().build().perform();
		System.out.println("moved");
		//WebElement nwiio=driver.findElement(By.xpath("//span[text()='New Individual']"));
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click;",nwi);
		//System.out.println("clicked");
	
	   return this;
				}
   public CreateIndividualsErrorValidation clickSaluationdropdownAndMr() {
	   driver.findElement(By.xpath("//div[contains(@class,\"salutation\")]")).click();
		driver.findElement(By.xpath("//a[@title=\"Mr.\"]")).click();
		return this;
				}
		
   public CreateIndividualsErrorValidation inputFirstName(String name) {
	   driver.findElement(By.xpath("//input[@placeholder=\"First Name\"][contains(@class,\"firstName\")]"))
	   .sendKeys(name);
		return this;
				}
		
   public CreateIndividualsErrorValidation Clicksavebutton() {
	   driver.findElement(By.xpath("//button[@title=\"Save\"]")).click();
		return this;
				}
   public String verifyLastNameErrorMsg() {
	   String lastnameerrormsg = driver.findElement(By.xpath("//ul[@class=\"errorsList\"]/li")).getText();
		System.out.println(lastnameerrormsg);
		return lastnameerrormsg;
				}
	
		

	
	

}
