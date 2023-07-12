package objectreporeading;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Key;
@Config.Sources("file:src/test/java/object/Repositories/Worktypeobject.properties")
public interface WorktypePageObject extends Config{
	
	
		
		@Key("navigation.xpath")
		String usernameElementByXpath();
		
		@Key("viewall.xpath")
		String Viewalllinkbyxpath();
		
		
		@Key("worktypelink.xpath")
		String worktypelinkByxpath();
		
		@Key("newbutton.xpath")
		String newbuttonElementByxpath();
		
		@Key("worktypename.xpath")
		String worktypenameElementByxpath();
		
		@Key("description.xpath")
		String descriptionElementByxpath();
		
		@Key("Operatinghours.xpath")
		String OperatinghoursElementByxpath();
		
		@Key("estimatedhours.xpath")
		String estimatedhoursbyxpath();
		
		@Key("Savebutton.xpath")
		String Savebuttonbyxpath();
		
		@Key("createdmessage.xpath")
		String createdmessagebyxpath();
		

	

}
