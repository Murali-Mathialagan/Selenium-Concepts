package com.basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Methods {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/alert");

		driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//button[.='Confirm Alert']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[.='Prompt Alert']")).click();
		driver.switchTo().alert().sendKeys("Murali");
		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.xpath("//button[.='Modern Alert']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss(); // No alert present exception

	}
}
