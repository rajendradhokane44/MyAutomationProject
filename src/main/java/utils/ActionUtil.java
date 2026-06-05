package utils;

import org.openqa.selenium.By;

import Base.BaseClass;

public class ActionUtil 
{
	public static void click(By locator)
	{
		BaseClass.getDriver().findElement(locator).click();
	}
	
	public static void type(By locator, String value)
	{
		BaseClass.getDriver().findElement(locator).sendKeys(value);
	}

}
