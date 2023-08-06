package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinitions {

	//Creating the constructor for the class and getting those testInstance and assigning into constructor
	//all the value will fall under inside constructor and assign to global variable using "this" keyword
	TestContextSetup testContextSetup;
		
	public LandingPageStepDefinitions(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	@Given("User at the greenkart landing page")
	public void user_at_the_greenkart_landing_page() {
		
	}
	@When("User search with shortname {string} and extract the fullname from the actual product")
	public void user_search_with_shortname_and_extract_the_fullname_from_the_actual_product(String shortname) throws InterruptedException {
		LandingPage landingpage = testContextSetup.pageObjectManager.getLandingPage();
		landingpage.searchItem(shortname);
		Thread.sleep(5000);
		String homePageProductFullName = landingpage.getProductName().split("-")[0].trim();
		System.out.println(homePageProductFullName + "This is the Full Name of the product in the HomePage" ); 
		landingpage.clikOnTopDeals();
	}
	
}
