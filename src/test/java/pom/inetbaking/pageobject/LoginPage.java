package pom.inetbaking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver Localdriver;
	
	public LoginPage(WebDriver Rdriver){
		
		Localdriver =Rdriver;
		PageFactory.initElements(Rdriver, this);
	}
		@FindBy(name ="uid")
		WebElement username ;
		@FindBy(name ="password")
		
				WebElement passwd;
		@FindBy(name ="btnLogin")
		
		WebElement loginbutton;
		
				
	public void keyinUsername(String un) {
		username.sendKeys(un);
		
	}
	
	public void keyinpass(String pass)
	{
		passwd.sendKeys(pass);
	}
	
	
	public void loginbutton() {
		loginbutton.click();
		
	}

	
		
	}
	
	

