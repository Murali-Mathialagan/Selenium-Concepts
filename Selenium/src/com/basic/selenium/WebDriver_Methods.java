package com.basic.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/accounts/login/");

		System.out.println(driver.getCurrentUrl());

		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		System.out.println(driver.getPageSource());
		Thread.sleep(2000);

		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().forward();
		Thread.sleep(2000);

		driver.navigate().refresh();
		Thread.sleep(2000);

		driver.close();

		driver.quit();

	}
}
