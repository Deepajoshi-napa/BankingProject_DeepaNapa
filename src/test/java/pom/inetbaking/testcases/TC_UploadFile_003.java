package pom.inetbaking.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pom.inetbaking.pageobject.UploadFile;

public class TC_UploadFile_003 extends BaseClass {
@Test
	public void uploadfile() throws IOException {
		
		
		UploadFile uploadpg = new UploadFile(driver);
		
		
		uploadpg.clickonselenium();
		
		uploadpg.selectselautoit();
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

		uploadpg.getjob();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		
		
		WebElement iframeElement = driver.findElement(By.id("JotFormIFrame-72320244964454"));
		driver.switchTo().frame(iframeElement);
		
		uploadpg.entertname("deepa");
		logger.info("entered name");
		uploadpg.entertemail("deepajoshi111@gmail.com");
		
		logger.info("entered enmail id");

		  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			uploadpg.clickonupload();
			 /*
			 * 
			 * 
			 * driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			 * Runtime.getRuntime().exec("C:\\opt\\UploadFile1.exe");
			 * captureScreen(driver,"UploadFileTEst");
			 */
		  
		  
		  
			  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			  
				uploadpg.entercomments("test");
				//logger.info("entered comments");

				  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			  uploadpg.clickonsubmit();
			
	}

}
