package testsuites;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseHooks;
import chainpageobjects.CreateIndividualsErrorValidation;

public class TestCase_CreateIndividualsErrorValidation extends BaseHooks{
	
	
	
	@Test
	public void CreateIndividualsErrorValidationMethod() {
		String lastnameerrormsg=new CreateIndividualsErrorValidation(driver)
		.clicknavigation()
		.clickViewalllink()
		.clickIndividualslink()
		.clickIndividualdropdownicon()
		.clickNewIndividual()
		.clickSaluationdropdownAndMr()
		.inputFirstName("Ganesh")
		.Clicksavebutton()
		.verifyLastNameErrorMsg();
		
		
		Assert.assertEquals(lastnameerrormsg, "These required fields must be completed: Last Name");
		
		
		
		
		
		
	}

}
