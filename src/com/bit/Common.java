package com.bit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Common {
	ChromeDriver dr;
	Common(ChromeDriver dr){
		this.dr=dr;
	}
	
	
	public void myGet(String url) {
		dr.get(url);
		
	}
	

}
