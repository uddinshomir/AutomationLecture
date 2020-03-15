package com.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngGCR {
	WebDriver driver;
	GCRPageFactory pf;
	
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
//		String localDir = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", localDir +"\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		pf = PageFactory.initElements(driver, GCRPageFactory.class); 
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/");
	}
	
	@Test
	public void getLogin() {
		pf.getMyAccount().click(); 
		
		WebElement userName = driver.findElement(By.xpath("//*[@name='email_address']"));
		userName.sendKeys("selenium1994@gmail.com"); 
		
		WebElement passWord = driver.findElement(By.xpath("//*[@name='password']"));
		passWord.sendKeys("selenium"); 
		
		WebElement signIn = driver.findElement(By.xpath("(//*[@class='ui-button-text'])[5]"));
		signIn.click(); 
		
	}
	
	@AfterTest
	public void quitDriver() {
		driver.quit();
	}
	


}
