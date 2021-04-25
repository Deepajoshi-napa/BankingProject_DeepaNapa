package pom.inetbaking.testcases;

import java.io.IOException;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.inetbaking.pageobject.LoginPage;
import pom.inetbaking.utilities.DatasheetUtil;

public class TestCaseforDDT extends BaseClass {
	
	@Test(dataProvider="LoginData")
	public void DDT(String user,String pwd) throws Exception
	{
		
	
		//		//LoginPage loginpg = new LoginPage(driver);
		System.out.println(URL);
		LoginPage lp=new LoginPage(driver);
		lp.keyinUsername(user);
		logger.info("user name provided");
		lp.keyinpass(pwd);
		logger.info("password provided");
		lp.loginbutton();
		logger.info("Loginbutton Clicked");
	
		
		
		
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login failed");
			captureScreen(driver,"Tetscase2Screenshot");
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Login passed");
			//lp.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();
			
		}
		
		
	}
	
	
	public boolean isAlertPresent() //user defined method created to check alert is presetn or not
	{
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}
	
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/pom/inetbaking/testdata/LoginDatanew.xlsx";
		System.out.println("Getting data from excel--->"+ path);
		
		System.out.println(DatasheetUtil.getCellData(path,"Sheet1",1, 0));
		int rownum=DatasheetUtil.getRowCount(path, "Sheet1");
		
		System.out.println(rownum);
		int colcount=DatasheetUtil.getCellCount(path,"Sheet1",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=DatasheetUtil.getCellData(path,"Sheet1", i,j);//1 0
				
				System.out.println(logindata[i][j]);
			}
				
		}
	return logindata;
	}

}
