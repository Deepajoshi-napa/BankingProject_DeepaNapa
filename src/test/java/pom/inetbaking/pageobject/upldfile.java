package pom.inetbaking.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class upldfile {


WebDriver lcdriver1;
	
	public upldfile(WebDriver Rdriver){
		
		lcdriver1 =Rdriver;
		PageFactory.initElements(Rdriver, this);
	}
	
	@FindBy(className="dropdown-toggle")
	
	WebElement Selestlink1;
//@FindBy(className="nav navbar-nav")List<WebElement> Selestlink;
	//WebElement Selestlink ;
//@FindBy(className="dropdown-menu")List<WebElement> uploadfilelink;
	//WebElement uploadfilelink;
	
	//@FindBy(css="input#photoimg")WebElement uploadfilelink;

public void clickonselenium()
{
	Selestlink1.click();
}

public void clickonlink()
{
	
	//uploadfilelink.get(2).click();
	
	Actions actions = new Actions(lcdriver1);
	//Actions actions = new Actions(lcdriver1);
    //Retrieve WebElement 'Music' to perform mouse hover 
WebElement menuOption = lcdriver1.findElement(By.cssSelector("li:nth-of-type(17) > a"));
 //Mouse hover menuOption 'Music'
	
	 actions.moveToElement(menuOption).perform();
 //ctions.keyDown("Delete Customer Form").click();
	 menuOption.click();
 
}

}
