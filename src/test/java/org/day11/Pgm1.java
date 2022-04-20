package org.day11;

import org.base.BaseClass;
import org.openqa.selenium.support.FindBy;

public class Pgm1 extends BaseClass{
public static void main(String[] args) {
	launchBrowser("chrome");
	launchURL(" http://demo.guru99.com/test/write-xpath-table.html\r\n", 10);
//	@FindBy()
//	findelement(locatorname, locatorvalue)
}
}
