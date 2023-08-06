package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver intlizeBrowser() throws IOException
	{
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+ "//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("QAUrl");
		if(driver == null)
		{
			if(System.getProperty("browser").equalsIgnoreCase("Chrome"))
			{
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(options);
				//driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			if(System.getProperty("browser").equalsIgnoreCase("firefox"))
			{
					//firefoxcode
			}
			
			driver.get(url);
		}
		return driver; 
	}

}
