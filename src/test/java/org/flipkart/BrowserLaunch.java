package org.flipkart;

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

import org.base.BaseClass;

public class BrowserLaunch extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException, IOException{
		launchBrowser("chrome");
		launchURL("https://www.flipkart.com/", 10);
		
		LoginPage l=new LoginPage();
		Thread.sleep(1000);
		btnclick(l.getClosebtn());
		
		
		ChoicePage c=new ChoicePage();
		sendkeys(c.getSrcvalue(), "Apple 13");
		btnclick(c.getBtnsrc());
		btnclick(c.getClkurchoice());
		
		ProductPage pp=new ProductPage();
		
		String windowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		Thread.sleep(1000);
		for(String win:windowHandles) {
			if(!windowHandles.equals(windowHandle)) {
				driver.switchTo().window(win);
			}
		}
		btnclick(pp.getAddtocartbtn());
		Thread.sleep(1000);

		btnclick(pp.getPlaceOrder());
		pp.ProductPage("9942754605", "7010796708");
		
		
//		Thread.sleep(1000);
//		sendkeys(pp.getEnterPassword(), "foodpanda");
//		btnclick(pp.getClickLogin());
		
		PlaceOrder po=new PlaceOrder();
		sendkeys(po.getFillname(), getExcelData("Login","Sheet1",1,0));
		sendkeys(po.getFillPhoneNo(),getExcelData("Login","Sheet1",1,1));
		sendkeys(po.getPinCode(),getExcelData("Login","Sheet1",1,2));
		sendkeys(po.getLocality(), getExcelData("Login","Sheet1",1,3));
//		Thread.sleep(1000);
		sendkeys(po.getAddress(), getExcelData("Login","Sheet1",1,4));
		sendkeys(po.getCity(), getExcelData("Login","Sheet1",1,5));
		
//		po.getState(windowHandle), getExcelData("Login","Sheet1",1,6);
//	/po.getState(getExcelData("Login","Sheet1",1,6));
//	selectByVisibleText(po.getState(),"tamilnadu");
//	selectbyvalue(po.getState(),"Andaman & Nicobar Islands");
	
		sendkeys(po.getLandmark(), getExcelData("Login","Sheet1",1,7));
		sendkeys(po.getAlternatephone(), getExcelData("Login","Sheet1",1,8));
		btnclick(po.getWork("work"));
		btnclick(po.getClkdelivery());
	
		
		OrderSummary os=new OrderSummary();
		btnclick(os.getClicksummary());

		
		
		

	}
	
}
