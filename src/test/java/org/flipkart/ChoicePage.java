package org.flipkart;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.base.BaseClass;


public class ChoicePage extends BaseClass{

	public ChoicePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath=("//input[@name='q']"))
	private WebElement srcvalue;
	
	public WebElement getSrcvalue() {
		return srcvalue;
	}
	
	@FindBy(xpath=("//button[@type='submit']"))
	private WebElement btnsrc;

	public WebElement getBtnsrc() {
		return btnsrc;
	}
	
	@FindBy(xpath=("//div[text()='APPLE iPhone 13 (Midnight, 128 GB)']"))
	private WebElement clkurchoice;

	public WebElement getClkurchoice() {
		return clkurchoice;
	}
			
	
	
}
