package com.basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Methods {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		a.moveToElement(women).build().perform(); // move to element method

		WebElement casualdress = driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[1]"));
		a.click(casualdress).build().perform(); // click(web element) method
		Thread.sleep(2000);
		
		WebElement rightclick = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		a.contextClick(rightclick).build().perform();

	}

}
