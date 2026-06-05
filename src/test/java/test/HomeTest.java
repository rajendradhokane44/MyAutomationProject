package test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoproject.pages.LoginPage;

import Base.BaseClass;
import pages.HomePage1;

public class HomeTest extends BaseClass
{

	@BeforeMethod
	public void setup()
	{
		initDriver();
		//LoginPage lp=new LoginPage();
	}
	
	@Test
	public void verifyDashboardVisible()
	{
	new LoginPage().login(prop.getProperty("username"), prop.getProperty("password"));
	Assert.assertTrue(new HomePage1().isDashboardDisplayed());
	}
}
