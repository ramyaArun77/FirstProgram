package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

//	public void getuser() {
//  // without page factory
//		WebElement txtusername = driver.findElement(By.id("email"));
//		return txtusername;
//	}
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	//	PageFactory.initElements(driver,LoginPage.class);
	}

	
	// With page factory
	@FindBy(id="email")
	private WebElement txtusername;
	@FindBy(id="pass")
	private WebElement txtpassword;
	@FindBy(name="login")
	private WebElement loginbtn;
	

	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
}
