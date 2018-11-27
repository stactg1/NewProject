package com.bit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario {
	ChromeDriver dr;
		Scenario(ChromeDriver dr){
		this.dr = dr;
		
		
	}
	Common c;
	public void target() {
		c = new Common (dr);
		c.myGet("http:/www.target.com");
		
		
		
		
	}
	

}
