package org.flipkart;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder extends BaseClass{
	
	public PlaceOrder() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement fillname;

	public WebElement getFillname() {
		return fillname;
	}

	@FindBy(xpath="//input[@name='phone']")
	private WebElement fillPhoneNo;

	public WebElement getFillPhoneNo() {
		return fillPhoneNo;
	}
	
	@FindBy(xpath="//input[@name='pincode']")
	private WebElement pinCode;

	public WebElement getPinCode() {
		return pinCode;
	}
	@FindBy(xpath="//input[@name='addressLine2']")
	private WebElement locality;
	public WebElement getLocality() {
		return locality;
	}
	
	@FindBy(xpath="//textarea[@name='addressLine1']")
	private WebElement address;
	public WebElement getAddress() {
		return address;
	}
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	public WebElement getCity() {
		city.clear();
		return city;
	}
	
	@FindBy(xpath="//div[text()='State']")
	private WebElement state;
	
	public WebElement getState() {
//		state.clear();
		return state;
	}

	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement landmark;
	public WebElement getLandmark() {
		return landmark;
	}
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	private WebElement alternatephone;

	public WebElement getAlternatephone() {
		return alternatephone;
	}
	
	@FindBy(xpath="(//div[@class='_1XFPmK'])[3]")
	private WebElement work;

	public WebElement getWork(String value) {
		if(value.equals("home")) {
			return home;
		}
		else {
			return work;
		}
	}
	
	@FindBy(xpath="(//div[@class='_1XFPmK'])[2]")
	private WebElement home;

	@FindBy(xpath="//button[text()='Deliver Here']")
	private WebElement clkdelivery;

	public WebElement getClkdelivery() {
		return clkdelivery;
	}
	
}
