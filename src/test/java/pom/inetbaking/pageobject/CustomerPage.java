package pom.inetbaking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage  {

	
WebDriver ldriver;
	
	public CustomerPage(WebDriver Rdriver){
		
		ldriver =Rdriver;
		PageFactory.initElements(Rdriver, this);
	}
		@FindBy(xpath ="/html/body/div[3]/div/ul/li[2]/a")
		WebElement newcust ;
		@FindBy(xpath ="/html/body/table[@class='layout']/tbody/tr/td/table//input[@name='name']")
		
				WebElement custname;
		@FindBy(xpath ="/html/body/table[@class='layout']/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
		
		WebElement custgender;
		@FindBy(xpath ="/html//input[@id='dob']")
		
		WebElement custdob;
		@FindBy(xpath ="/html/body/table[@class='layout']/tbody/tr/td/table//textarea[@name='addr']")
		
		WebElement custadd;
		@FindBy(xpath ="/html/body/table[@class='layout']/tbody/tr/td/table//input[@name='city']")
		
		WebElement custcity;
		@FindBy(xpath ="/html/body/table[@class='layout']/tbody/tr/td/table//input[@name='state']")
		
		WebElement custstate;
		
	@FindBy(xpath ="/html/body/table[@class='layout']/tbody/tr/td/table//input[@name='pinno']")
		
		WebElement custpin;
	
	@FindBy(xpath ="/html/body/table[@class='layout']/tbody/tr/td/table//input[@name='telephoneno']")
	
	WebElement custmob;
	
	@FindBy(name ="emailid")
	
	WebElement custemail;
	@FindBy(xpath ="/html/body/table[@class='layout']/tbody/tr/td/table//input[@name='password']")
	
	WebElement custpwd;
		
		@FindBy(xpath ="/html/body/table[@class='layout']/tbody/tr/td/table//input[@name='sub']")
		
		WebElement custsubmit;
		
		
public void newcust() {
	newcust.click();
	
}
				
	public void keyincustUsername(String cun) {
		custname.sendKeys(cun);
		
	}
	
	public void keyincustgender()
	{
		custgender.click();
	}
	
	public void keyincustdob(String cmm, String cdd, String cyyyy)
	{
		custdob.sendKeys(cmm);
		custdob.sendKeys(cdd);
		custdob.sendKeys(cyyyy);
	}
	
	public void keyincustadd(String cadd)
	{
		custadd.sendKeys(cadd);
	}
	
	public void keyincustcity(String ccity)
	{
		custcity.sendKeys(ccity);
	}
	
	public void keyincuststate(String cstate)
	{
		custstate.sendKeys(cstate);
	}
	
	public void keyincustpin(String cpin)
	{
		custpin.sendKeys(cpin);
	}
	public void keyincustmob(String cmob)
	{
		custmob.sendKeys(cmob);
	}
	
	public void keyincustemail(String cemail)
	{
		
		
		custemail.sendKeys(cemail);
	}
	
	public void keyincustpass(String cpass)
	{
		custpwd.sendKeys(cpass);
	}
	
	public void createcust() {
		custsubmit.click();
		
	}

}
