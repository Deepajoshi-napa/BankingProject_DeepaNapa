package pom.inetbaking.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pom.inetbaking.pageobject.upldfile;



public class testupload extends BaseClass {
@Test
	public void testuploadtest() throws Exception {
		
	upldfile upld = new upldfile(driver);
				
				
				upld.clickonselenium();
				
				upld.clickonlink();
				
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

				upld.clickonuploadbutton();
				captureScreen(driver,"testinguploadfile");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
				
				
}}
