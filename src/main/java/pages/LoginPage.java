package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demoproject.base.Baseclass;
import com.demoproject.util.waitUtils;

import Base.BaseClass;
import utils.ActionUtil;

public class LoginPage 
{
//	By username=By.name("username");//this is 1 method
//	By password=By.name("password");
//	By loginBtn= By.xpath("//button[@type='submit']");

	
	
//	public void login(String user, String pass)
//	{
//		BaseClass.getDriver().findElement(username).sendKeys(user);
//		BaseClass.getDriver().findElement(password).sendKeys(pass);
//		BaseClass.getDriver().findElement(loginBtn).click();
//	}//end of 1 method
	
	
//	public LoginPage()//2 method
//	{
//		PageFactory.initElements(Baseclass.getDriver(), this);
//	}
//	@FindBy(name="username") WebElement username;
//	@FindBy(name="password") WebElement password;
//	@FindBy(xpath ="//button[@type='submit']") WebElement loginBtn;
//	
//	public void login(String user, String pass)
//	{
//		waitUtils.waitForElement(By.name("username"));
//		// System.out.println("Typing username: " + user);
//		username.sendKeys(user);
//		//waitUtils.waitForElement(By.name("password"));
//		 System.out.println("Typing username: " + pass);
//		password.sendKeys(pass);
//		 waitUtils.waitForElement(By.xpath("//button[@type='submit']"));
//		loginBtn.click();
//	}
//	//2 method end
	
	By username=By.name("username");
	By password=By.name("password");
	By loginBtn= By.xpath("//button[@type='submit']");
	
	public void login(String user, String pass)
	{
		waitUtils.waitForElement(username);
		ActionUtil.type(username, user);
		ActionUtil.type(password, pass);
		ActionUtil.click(loginBtn);
		//thank You
	}
	
}
