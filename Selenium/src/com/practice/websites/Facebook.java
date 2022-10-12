package com.practice.websites;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\sblue\\eclipse-workspace\\Selenium\\Snap\\Testimg.png");
		FileUtils.copyFile(src, dest);

		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("muralimariyan8@gmail.com");

		Thread.sleep(2000);

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Murali@25359");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration')]")).click();

	}
}
