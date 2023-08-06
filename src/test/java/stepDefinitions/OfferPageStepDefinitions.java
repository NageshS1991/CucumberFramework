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
import pageObjects.OfferPage;
import utils.TestContextSetup;

public class OfferPageStepDefinitions {
	
	//Creating the constructor for the class and getting those testInstance and assigning into constructor
	//all the value will fall under inside constructor and assign to global variable using "this" keyword
	TestContextSetup testContextSetup;
	
	public OfferPageStepDefinitions(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	@Then("User search with the {string} shortname from the offer page")
	public void user_search_with_the_shortname_from_the_offer_page(String shortname) throws InterruptedException {
		OfferPage offerpage = new OfferPage(testContextSetup.driver);
		testContextSetup.genericUtil.SwitchtoChildWindow();
		testContextSetup.pageObjectManager.getOfferPage();
		offerpage.searchText(shortname);
		Thread.sleep(5000);
		String offerPageProductFullName = offerpage.getProductFullName();
		System.out.println(offerPageProductFullName + "This is the Full Name of the product in the OfferPage" );  
	}
	@And("Validate the both product name are same")
	public void validate_the_both_product_name_are_same() {
	   Assert.assertEquals(testContextSetup.homePageProductFullName, testContextSetup.offerPageProductFullName);
	}

}
