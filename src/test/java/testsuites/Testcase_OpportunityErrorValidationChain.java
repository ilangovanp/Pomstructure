package testsuites;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseHooks;
import chainpageobjects.OpportunityErrorValidationChain;

public class Testcase_OpportunityErrorValidationChain extends BaseHooks {
	
	@Test
	public void OpportunityErrorValidationMethod() {
		
			
		String errormessages=new OpportunityErrorValidationChain(driver)
		.clicknavigation()
		.clickViewalllink()
		.clickSales()
		.clickOpportunities()
		.clickNew()
		.clickdate()
		.clickSave()
		.validateErrorMessages();
		
	Assert.assertEquals(errormessages.trim(), "Opportunity Name Stage");	
		
		
		
		
	}
	

}
