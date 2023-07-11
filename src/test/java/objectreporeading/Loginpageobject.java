package objectreporeading;

import org.aeonbits.owner.Config;


@Config.Sources("file:src/test/java/object/Repositories/loginobject.properties")
public interface Loginpageobject extends Config{
	
	@Key("Username.xpath")
	String usernameElementByXpath();
	
	@Key("Password.id")
	String passwordElementById();
	
	
	@Key("Loginbutton.name")
	String loginbuttonElementByName();
	

}
