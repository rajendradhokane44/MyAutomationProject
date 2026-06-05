package pages;

import org.openqa.selenium.By;

import com.demoproject.base.Baseclass;

public class HomePage1 
{
	
		By dashboardText=By.xpath("//h6[text()='Dashboard']");
		
		public boolean isDashboardDisplayed()
		{
			return Baseclass.getDriver().findElement(dashboardText).isDisplayed();
			
		}

	}


