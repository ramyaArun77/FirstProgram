package org.day12;

import org.base.BaseClass;
import org.openqa.selenium.JavascriptExecutor;

public class Pgm1 extends BaseClass {
  public static void main(String[] args) {
	launchBrowser("chrom");
	launchURL("http://www.greenstechnologys.com/", 50);
	JavascriptExecutor j=(JavascriptExecutor) driver;
	j.executeScript("window.scrollBy(0,600)");
}
}
