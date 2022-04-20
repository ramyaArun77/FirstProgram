package org.flipkart;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummary extends BaseClass{
public OrderSummary() {
PageFactory.initElements(driver, this);
}

@FindBy(xpath="//span[text()='Order Summary']")
private WebElement clicksummary;

public WebElement getClicksummary() {
	return clicksummary;
}



}
