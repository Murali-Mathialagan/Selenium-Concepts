package com.basic.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Browser {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\msedgedriver.exe");
		
		//import 'WebDriver' - org.openqa.selenium.WebDriver;
		//import 'ChromeDriver' - org.openqa.selenium.chrome.ChromeDriver;
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");

	}

}
