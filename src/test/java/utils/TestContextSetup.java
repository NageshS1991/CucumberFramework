package utils;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	
	public ChromeDriver driver;
	public String  homePageProductFullName;
	public String offerPageProductFullName;
	public PageObjectManager pageObjectManager;
	public TestBase testbase;
	public GenericUtil genericUtil;
	
	public TestContextSetup() throws IOException
	{
		testbase = new TestBase();
		pageObjectManager = new PageObjectManager(testbase.intlizeBrowser());
		genericUtil = new GenericUtil(testbase.intlizeBrowser());
	}

}
