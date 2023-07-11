package utils;
import java.text.SimpleDateFormat;  
import java.util.Date; 
public class DateHandler {

	public String dateCall(){
		 Date date = new Date();  
		    SimpleDateFormat formatter = new SimpleDateFormat("yyMMddHHmmssZ");  
		    String strDate= formatter.format(date);  
		    //System.out.println(strDate); 
		    return strDate;
		
	} 

}
