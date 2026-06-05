package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoproject.base.Baseclass;
import com.demoproject.pages.HomePage;
import com.demoproject.pages.LoginPage;

import pages.HomePage1;

public class LoginTest extends Baseclass
{
	LoginPage loginPage;
	HomePage1 homePage;
	
	
	@BeforeMethod
	public void setup()
	{
		initDriver();
		loginPage=new LoginPage();
		homePage=new HomePage1();
	}
	
	@Test
	public void verifyLogin()
	{
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertTrue(homePage.isDashboardDisplayed());
	}
	@AfterMethod
	public void tearDown()
	{
		quitDriver();
	}

}
