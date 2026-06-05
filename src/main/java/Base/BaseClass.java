package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BaseClass 
{
	public static ThreadLocal<WebDriver> driver=new ThreadLocal<WebDriver>();
	public Properties prop;
	
	// create cunstroctor
	
	public BaseClass()
	{
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream("src/test/resources/config/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		public WebDriver initDriver()
		{
			String browser=prop.getProperty("browser");
			driver.set(factory.DriverFactory.initDriver(browser));
			getDriver().manage().window().maximize();
			getDriver().get(prop.getProperty("url"));
			return getDriver();
				
		}
		
		public static WebDriver getDriver()
		{
			return driver.get();
			
		}
		
		public void quitDriver()
		{
			getDriver().quit();

			driver.remove();
			
		}
	
	
	

}
