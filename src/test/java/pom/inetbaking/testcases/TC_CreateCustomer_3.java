package pom.inetbaking.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pom.inetbaking.pageobject.CustomerPage;

public class TC_CreateCustomer_3 extends BaseClass {

	@Test
	public void Custlogin() throws Exception {

		
		
		TC_Login_001 login =new TC_Login_001();
	login.LoginTest001();
	CustomerPage custpg = new CustomerPage(driver);
		custpg.newcust();

			logger.info("Creating new customer");

		String newcust = "NewCustomer" + shortrandomestring();
		
		System.out.println(newcust);
		custpg.keyincustUsername(newcust);

			logger.info("customer name Entered");
			
			custpg.keyincustgender();
			

			logger.info("customer gender selected");
		
			String cdate = 	String.valueOf(randomdate());
			String cMonth = String.valueOf(randomMonth());
			String cyear = String.valueOf(randomyear());
			
			custpg.keyincustdob(cdate, cMonth, "19"+cyear);
			
			
			logger.info("Customer DOB entered");
			
			String newcadd = "Customer Address\n"+ randomestring();
			System.out.println(newcadd);
			custpg.keyincustadd(newcadd);

				logger.info("customer Address Entered");
				
				//String newCustCity = "Customer Address " + randomestring();
				custpg.keyincustcity(newCustCity);
				logger.info("customer city Entered");
				custpg.keyincuststate(NewCustState);
				logger.info("customer state Entered");
				
				String custpin = 	String.valueOf(randomeNum6());	
				custpg.keyincustpin(custpin);
				logger.info("customer pin Entered");
				
				System.out.println(custpin);
				String custmob = String.valueOf(randomeNum10()+randomeNum10()+randomeNum10());	
				custpg.keyincustmob(custmob);
				logger.info("customer mobile Entered");
				System.out.println(custmob);
				
				
				String custemail = 	String.valueOf(randomestring()+randomestring().toUpperCase()+"@gmail.com");	
				
				
				custpg.keyincustemail(custemail);
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				System.out.println(custemail);
				logger.info("customer email Entered");
				
				custpg.keyincustpass(randomestring());
				logger.info("customer password Entered");

				custpg.createcust();
				//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				//driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement pgheader =driver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[1]"));
		System.out.println(pgheader.getText());
		
		
		Assert.assertTrue(pgheader.getText().contains("Customer Registered Successfully!!!"), "page hearder Fails");
		
		String pageurl =driver.getCurrentUrl();
		String pageurl1 =pageurl.replace("http://demo.guru99.com/V4/manager/CustomerRegMsg.php?cid=", "a");
		String pageurl2 =pageurl1.substring(1, 5);
		System.out.println(pageurl2);
		
		WebElement custid =driver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[4]/td[2]"));
		System.out.println(custid.getText());
		
		Assert.assertTrue(custid.getText().contains(pageurl2), "Customer creation failed");
		//Assert.assertTrue(custid.getText().contains("Customer Registered Successfully!!!"), "Test Fails");
		captureScreen(driver,"customercrated"+custid);
	}
}
