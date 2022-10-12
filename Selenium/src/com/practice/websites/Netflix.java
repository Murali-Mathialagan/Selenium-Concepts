package com.practice.websites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Netflix {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.netflix.com/in/");

		driver.findElement(By.name("email")).sendKeys("muralimariyan8@gmail.com");

		driver.findElement(By.xpath("//span[text()='Get Started'][1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();

	}

}
