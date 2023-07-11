package chainpageobjects;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;

import objectreporeading.Loginpageobject;
import testsuites.Testcase_Worktype;

public class LoginPagechain {
	
    private  WebDriver driver; 
    Loginpageobject c;

	
	public LoginPagechain(WebDriver driver) {
         c=ConfigFactory.create(Loginpageobject.class);
       
	    this.driver=driver;
		
	}
	
	public LoginPagechain username(String user) {
		WebElement username=driver.findElement(By.xpath(c.usernameElementByXpath()));
		username.sendKeys(user);
		return this;
		
	}
   public LoginPagechain password(String pass) {
	   WebElement password=driver.findElement(By.id(c.passwordElementById()));
	   password.sendKeys(pass);
	return this;
	}
   public WorkTypechain clicklogin() {
	   WebElement Login=driver.findElement(By.name(c.loginbuttonElementByName()));
	   Login.click();;
	return new WorkTypechain(driver);
	}

}
