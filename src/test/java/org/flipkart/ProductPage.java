package org.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.base.BaseClass;

public class ProductPage extends BaseClass {

	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement addtocartbtn;

	public WebElement getAddtocartbtn() {
		return addtocartbtn;
	}

	@FindAll({@FindBy(xpath="//button[@class='_2KpZ6l _2ObVJD _3AWRsL']"),@FindBy(xpath="//span[text()='Place Order']")})
	private WebElement placeOrder;
	public WebElement getPlaceOrder() {
		return placeOrder;
	}
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement EnterPhone;
	public WebElement getEnterPhone() {
		return EnterPhone;
	}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement clickcontinue;
	public WebElement getClickcontinue() {
		return clickcontinue;
	}
	
//	@FindAll({@FindBy(xpath="//input[@type='password']"),@FindBy(xpath="//input[@class='_2IX_2- _3mctLh _17N0em']")})
	@FindBy(xpath="//input[@type='password']")
	private WebElement enterPassword;
	public WebElement getEnterPassword() {
		return enterPassword;
	}

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement enterOtp;
	
	public WebElement getEnterOtp() {
		return enterOtp;
	}

	@FindBy(xpath="//button[@type='submit']")
	private WebElement clickLogin;
	public WebElement getClickLogin() {
		return clickLogin;
	}

	@FindBy(xpath="//button[@type='submit']")
	private WebElement clickLogin1;
	
	
	public WebElement getClickLogin1() {
		return clickLogin1;
	}

	@FindBy(xpath="//span[text()='Forgot?']")
	private WebElement clickForget;
	public WebElement getClickForget() {
		return clickForget;
	}
	
	public void ProductPage(String Num,String pass) throws InterruptedException {
		sendkeys(getEnterPhone(),Num);
		btnclick(getClickcontinue());
		
		sendkeys(getEnterPassword(),pass);
		
		if(pass.equals("7010796708")) {
			btnclick(getClickLogin());
		}
		else {
			btnclick(clickForget);
			
			Scanner s=new Scanner(System.in);
			sendkeys(getEnterOtp(),s.next());
			Thread.sleep(1000);
			//set new password
			sendkeys(getEnterPassword(), s.next());
			Thread.sleep(1000);
			
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
		
//			WebElement e = driver.findElement(By.xpath("//span[text()='Login']"));
//			js.executeScript("arguments[0].click()", e);
			btnclick(getClickLogin());			}
	}
	

	
	
	}
	




