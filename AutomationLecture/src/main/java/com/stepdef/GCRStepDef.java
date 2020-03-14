package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.selenium.GCRPageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class GCRStepDef { 
	
	WebDriver driver; 
	GCRPageFactory pf; 
	
	
	@Given("User is on GCR Homepage")
	public void user_is_on_GCR_Homepage() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uddin\\eclipse-workspace\\AutomationLecture\\src\\main\\resources\\driver\\chromedriver.exe");
	    driver = new ChromeDriver(); 
	    pf = PageFactory.initElements(driver, GCRPageFactory.class);
	    driver.manage().window().maximize();
	    driver.get("http://www.gcrit.com/build3/");
	}

	@When("User clicks on the account")
	public void user_clicks_on_the_account() {
		pf.getMyAccount().click(); 
	}

	@When("User write username")
	public void user_write_username() {
		WebElement userName = driver.findElement(By.xpath("//*[@name='email_address']"));
		userName.sendKeys("selenium1994@gmail.com"); 
	}

	@When("User writes password")
	public void user_writes_password() {
		WebElement passWord = driver.findElement(By.xpath("//*[@name='password']"));
		passWord.sendKeys("selenium");
	}

	@When("User clicks sign in")
	public void user_clicks_sign_in() {
		WebElement signIn = driver.findElement(By.xpath("(//*[@class='ui-button-text'])[5]"));
		signIn.click(); 
	}

	@Then("User is signed in")
	public void user_is_signed_in() {
		driver.getTitle();	}


}
