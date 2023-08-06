package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtil {
	
	public WebDriver driver;
	
	public GenericUtil(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void SwitchtoChildWindow()
	{
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		String homewindow = it.next();
		String offerwindow = it.next();
		driver.switchTo().window(offerwindow);
	}

}
