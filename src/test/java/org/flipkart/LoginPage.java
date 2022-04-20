package org.flipkart;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//button)[2]")
	private WebElement closebtn;
	public WebElement getClosebtn() {
		return closebtn;
	}
	
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement loginName;
	public WebElement getLoginName() {
		return loginName;
	}
	
	
	@FindBy(xpath="//select[@name='state']")
	private WebElement dropdown;
	public WebElement getDropdown() {
		return dropdown;
	}
	
	
	
	
	
}
