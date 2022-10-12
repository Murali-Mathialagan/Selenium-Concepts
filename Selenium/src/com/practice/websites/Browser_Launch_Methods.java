package com.practice.websites;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch_Methods {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/"); // web driver method

		System.out.println(driver.getTitle()); // web driver method

		System.out.println(driver.getCurrentUrl()); // web driver method

		WebElement username = driver.findElement(By.name("email")); // web driver method

		username.sendKeys("muralimariyan8"); // web element method

		Thread.sleep(2000);

		username.clear(); // web element method

		username.sendKeys("muralimariyan8@gmail.com");

		System.out.println(username.getAttribute("name"));

		TakesScreenshot ts = (TakesScreenshot) driver; // take screenshot
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\sblue\\eclipse-workspace\\Selenium\\Screenshot\\username.png");
		FileUtils.copyFile(src, dest);

		Thread.sleep(2000);

		driver.navigate().to("https://www.instagram.com/accounts/login/");

		driver.navigate().back(); // Web driver methods

		driver.navigate().forward();

		driver.navigate().refresh();

		driver.manage().window().maximize();

		WebElement data = driver.findElement(By.xpath("//div[text()='Meta']"));

		System.out.println(data.getText());// web element method

		System.out.println(data.getTagName());// web element method

		Dimension size = data.getSize(); // web element method
		System.out.println(size);

		Dimension size1 = driver.manage().window().getSize();
		System.out.println(size1);

		driver.manage().window().minimize(); // Web driver methods

		Dimension size2 = driver.manage().window().getSize();
		System.out.println(size2);

		driver.manage().window().fullscreen();

		Dimension size3 = driver.manage().window().getSize();
		System.out.println(size3);
	}

}
