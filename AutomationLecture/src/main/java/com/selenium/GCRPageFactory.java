package com.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GCRPageFactory {

	@FindBy(xpath = "(//*[@class='ui-button-text'])[3]")
	private WebElement myAccount;
	
	
	

	
	public WebElement getMyAccount() {
		return myAccount;
	} 
	
	
	
	
}
