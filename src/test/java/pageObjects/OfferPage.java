package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	
	WebDriver driver;
	public OfferPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By searchText =	By.id("search-field");
	By offerProductName =By.cssSelector("tr td:nth-child(1)");
		
	
	public void searchText(String name)
	{
		driver.findElement(searchText).sendKeys(name);
	}
	
	public String getProductFullName()
	{
		return driver.findElement(offerProductName).getText();
	}


}
