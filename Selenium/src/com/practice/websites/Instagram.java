package com.practice.websites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/accounts/login/");

		Thread.sleep(2000);

		WebElement data = driver.findElement(By.xpath("//div[text()='Meta']"));
		
		String text = data.getText();
		System.out.println(text);
		
		String tagName = data.getTagName();
		System.out.println(tagName);

		WebElement username = driver.findElement(By.xpath("//input[@aria-required='true'][1]"));
		username.sendKeys("muralimariyan8@gmail.com");
		
		System.out.println(username.getAttribute("value"));

		Thread.sleep(2000);

		WebElement password = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		password.sendKeys("Mariyan@25");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Forgot password?']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("emailOrPhone")).sendKeys("7708324140");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("fullName")).click();

	}

}
