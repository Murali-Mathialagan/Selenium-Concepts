package com.basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);

		driver.findElement(By.linkText("Sign up for Facebook")).click();

		driver.findElement(By.name("firstname")).sendKeys("Murali");
		Thread.sleep(2000);

// Using [Index]
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Mariyan");
		Thread.sleep(2000);
		
// Using (Contains)
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number')]")).sendKeys("7708324140");
		Thread.sleep(2000);

		driver.findElement(By.id("password_step_input")).sendKeys("Abc@123");
		Thread.sleep(2000);

		driver.findElement(By.partialLinkText("Already")).click();
		Thread.sleep(2000);
		
// Using Text()
		
		driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();

	}
}
