package pom.inetbaking.testcases;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pom.inetbaking.utilities.ReadConfig;

import org.apache.log4j.PropertyConfigurator;

public class BaseClass {

ReadConfig rdconfig =new ReadConfig();


	public static Logger logger = Logger.getLogger(BaseClass.class);
	public String Username =rdconfig.readusername();
	public String password =rdconfig.readpassword();
	
	public String newCustCity =rdconfig.readcustcity();
	public String NewCustState =rdconfig.readcuststate();
	public String custemail =rdconfig.readcustemail();
	public String URL =rdconfig.readurl();
	
	public WebDriver driver;

	@BeforeClass
	
	
	public void setup() {
		
		PropertyConfigurator.configure("log4j.properties");
	System.setProperty("webdriver.chrome.driver", rdconfig.readchromepath());
	
	  ChromeOptions options = new ChromeOptions();
	 // options.addArguments("--disable-popup-blocking");
	  //options.addArguments("--ignore-certificate-errors");
	  options.addArguments("--disable-translate");
	  options.addArguments("--user-data-dir=C:\\Temp\\chrome-dev-app2");
	  options.addArguments("--start-maximised");
	  options.addArguments("--window-size=1920,1080");
	  options.addArguments("--allow-insecure-localhost");
	 

	driver =new ChromeDriver(options);
	
	logger.info("Chrome is opened");
	
	
	driver.get(URL);
	//driver.navigate().back();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
	
	
	  @AfterClass
	  
	  public void teardown() { logger.info("Chrome is closed"); driver.close(); }
	 
	 
	
	public String captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(source.getName());
		File target = new File(System.getProperty("user.dir")+"\\Screenshots\\"+tname+".png");
		String errflpath =target.getAbsolutePath();
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
		System.out.println(target.getName());
		
		return errflpath;

		
	}
	
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public String shortrandomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(4);
		return(generatedstring);
	}
	
	public static String randomeNum4() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);}
		
		public static String randomeNum2() {
			String generatedString2 = RandomStringUtils.randomNumeric(2);
			return (generatedString2);}
			
			public static String randomeNum10() {
				String generatedString2 = RandomStringUtils.randomNumeric(10);
				return (generatedString2);}
				public static String randomeNum6() {
					String generatedString2 = RandomStringUtils.randomNumeric(6);
					return (generatedString2);
	}
				
				
				public static int randomdate() {
					
					Random r = new Random();
					int low = 10;
					int high = 30;
					int result = r.nextInt(high-low) + low;
				
					return result;
					
				}
public static int randomMonth() {
					
					Random r = new Random();
					int low = 10;
					int high = 12;
					int result = r.nextInt(high-low) + low;
					//Integer y = new Integer(result);
					
					return result;
					
				}

public static int randomyear() {
	
	Random r = new Random();
	int low = 50;
	int high = 99;
	int result = r.nextInt(high-low) + low;
	//Integer y = new Integer(result);
	
	return result;
	
}
				
	}
