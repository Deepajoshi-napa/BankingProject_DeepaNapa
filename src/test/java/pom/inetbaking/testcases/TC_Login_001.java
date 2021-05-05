package pom.inetbaking.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom.inetbaking.pageobject.LoginPage;

public class TC_Login_001 extends BaseClass{
	
	@Test
	public void LoginTest001() throws Exception {
		
		//driver.get(URL);
		LoginPage loginpg = new LoginPage(driver);
		logger.info("Home Page opened");
		
		loginpg.keyinUsername(Username);
		
		logger.info("Username Entered");
		loginpg.keyinpass(password);
		
		logger.info("Password Entered");
		loginpg.loginbutton();
		logger.info("Login button clicked");
		
		
		//driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//Localdriver.switchTo().alert().accept();
		  
		SoftAssert softAssertion= new SoftAssert();
		//System.out.println("softAssert Method Was Started");
		
		String title = driver.getTitle();

		captureScreen(driver,"loginTestScreenshot"+title);
		softAssertion.assertTrue(title.contains("Guru99 Bank Manager HomePage"),"****No Title Seen****" );
		//Assert.assertTrue(title.contains("Guru99 Bank Manager HomePage"), "****No Title Seen****");
	
		
		logger.info("LOGIN SUCCESSFULLY CREATED");
	}

}
