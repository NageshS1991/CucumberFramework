package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search= By.xpath("//input[@type=\"search\"]");
	By productName = By.xpath("//h4[@class=\"product-name\"]");
	By topDeals =By.xpath("//a[text()=\"Top Deals\"]");
	
	public void searchItem(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	
	public String  getProductName()
	{
		return driver.findElement(productName).getText();
	}
	public void clikOnTopDeals()
	{
		driver.findElement(topDeals).click();
	}
	
	

}
