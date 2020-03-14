package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class GCRShop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Uddin\\eclipse-workspace\\AutomationLecture\\src\\main\\resources\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		GCRPageFactory pf = PageFactory.initElements(driver, GCRPageFactory.class); 
		
		
		
		driver.manage().window().maximize();
		driver.get("http://www.gcrit.com/build3/");
		
		pf.getMyAccount().click(); 
		
		
		
		WebElement userName = driver.findElement(By.xpath("//*[@name='email_address']"));
		userName.sendKeys("selenium1994@gmail.com"); 
		
		WebElement passWord = driver.findElement(By.xpath("//*[@name='password']"));
		passWord.sendKeys("selenium"); 
		
		WebElement signIn = driver.findElement(By.xpath("(//*[@class='ui-button-text'])[5]"));
		signIn.click(); 
		
		
	}
	
	
	
	
}
