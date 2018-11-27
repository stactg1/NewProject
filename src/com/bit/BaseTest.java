package com.bit;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest{
	static ChromeDriver dr;
	
	public static void open(){
		System.setProperty("webdriver.chrome.driver", "/Users/water/Downloads/chromedriver");
	dr = new ChromeDriver();
	
	}
	
	public static void close() {
		dr.quit();
	}







}