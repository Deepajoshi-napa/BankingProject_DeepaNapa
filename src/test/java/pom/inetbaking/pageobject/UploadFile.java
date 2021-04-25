package pom.inetbaking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadFile {
	
WebDriver lcdriver;
	
	public UploadFile(WebDriver Rdriver){
		
		lcdriver =Rdriver;
		PageFactory.initElements(Rdriver, this);
	}
		@FindBy(xpath ="//div[@id='navbar-brand-centered']/ul[@class='nav navbar-nav']/li[1]/a[@href='#']")
		WebElement Selestlink ;
		
		@FindBy(xpath ="//div[@id='navbar-brand-centered']/ul[@class='nav navbar-nav']/li[1]/ul[@class='dropdown-menu']//a[@href='../../test/autoit.html']")
		
				WebElement selsutoit;
@FindBy(id ="postjob")
		
		WebElement getjob;
		
		
		@FindBy(xpath ="//form[@name='form_72320244964454']//ul/li[2]/div[@class='form-input-wide jf-required']/input[@name='q3_name']")
		
		WebElement tutorname;
		
		@FindBy(id ="input_4")
		
		WebElement tutoremail;
		
		@FindBy(xpath ="/html/body/form/div/ul/li[4]/div/input")
		WebElement uploadbutton;
		
		@FindBy(xpath ="/form[@name='form_72320244964454']/div[@role='main']/ul/li[6]/div[@class='form-input-wide']//button[@type='submit']")
		
		WebElement submit;
	
@FindBy(id ="input_6")
		
		WebElement tutorcomments;
		


    
		
		public void clickonselenium()
		{
			Selestlink.click();
		}
		
		public void entertname(String tname)
		{
			
			tutorname.sendKeys(tname);
		}
		
		public void selectselautoit()
		{
			selsutoit.click();
			
		
		}
		
		public void entercomments(String tcomments)
		{
			tutorname.sendKeys(tcomments);
		}
		
		public void entertemail(String cemail)
		{
			
			
			tutoremail.sendKeys(cemail);
		}
		
		public void clickonupload()
		{
			uploadbutton.click();
			uploadbutton.sendKeys("enter here");
		}
		
		public void getjob()
		{
			getjob.click();
		}
		public void clickonsubmit()
		{
			submit.click();
		}
}
