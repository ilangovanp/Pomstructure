package testsuites;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.retry.Retry;

import base.BaseHooks;
import chainpageobjects.LoginPagechain;
import chainpageobjects.WorkTypechain;

import utils.ReadConfig;
public class Testcase_Worktype extends BaseHooks{
	
	
	
	@Test
	public  void workTypeMethod() {
		
	 String createdmessage=new WorkTypechain(driver)
	 .clicknavigation()
	 .clickViewalllink()
	 .clickworktypelink()
	 .clicknewbutton()
	 .clicknewbutton()
	 .typeworktypename("Salesforce Project")
	 .typedescription("Specimen")
	 .typeoperatinghours("UK Shift")
	 .typeestimatedhours("7")
	 .clicksavebutton()
	 .getcreatedmessage();
		
	Assert.assertEquals(createdmessage, "Work Type \"Salesforce Project\" was created.");
		
		
		
	}

}
