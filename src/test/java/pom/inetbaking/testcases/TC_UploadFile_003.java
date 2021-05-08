package pom.inetbaking.testcases;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
		
		uploadpg.entertname(randomestring());
		logger.info("entered name");
		
		String custemail = 	String.valueOf(randomestring()+randomestring().toUpperCase()+"@gmail.com");	
		uploadpg.entertemail(custemail);
		
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
		  
		  
		  
			  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			  
				uploadpg.entercomments(randomestring());
				//logger.info("entered comments");

				  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			  uploadpg.clickonsubmit();
			  String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			  captureScreen(driver,"UploadFile "+dateName);
			  logger.info("UPLOAD SUCCESSFULLY CREATED");
			
	}

}
