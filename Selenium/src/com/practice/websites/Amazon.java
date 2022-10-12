package com.practice.websites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		
		d.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		d.findElement(By.id("nav-link-accountList")).click();
		
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
}
