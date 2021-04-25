package pom.inetbaking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties Prop;
	
	public ReadConfig() {
		
		File src =new File("C:\\Users\\deepa\\Downloads\\advanced-selenium-webdriver-master\\advanced-selenium-webdriver-master\\BEGINNING\\advanced-selenium-webdriver\\Configurations\\Config.properties");
		
		//String src;
		FileInputStream Fis;
		try {
			Fis = new FileInputStream(src);
			Prop = new Properties();
			Prop.load(Fis);
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print(e);
		}
		
	}

public String readusername() {
	
	String readun = Prop.getProperty("Username");
	return readun;
	
}

public String readurl() {
	
	String readurl = Prop.getProperty("URL");
	return readurl;
	
}
public String readpassword() {
	
	String readpass = Prop.getProperty("password");
	return readpass;
	
}
public String readchromepath() {
	
	String readCP = Prop.getProperty("ChromePath");
	return readCP;
	
}

public String readcustcity() {
	
	String readcustcity = Prop.getProperty("newCustCity");
	return readcustcity;
	
}

public String readcuststate() {
	
	String readcuststate = Prop.getProperty("NewCustState");
	return readcuststate;
	
}

public String readcustemail() {
	
	String readcustemail = Prop.getProperty("custemail");
	return readcustemail;
	
}
}



