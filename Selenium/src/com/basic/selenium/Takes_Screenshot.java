package com.basic.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takes_Screenshot {
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\sblue\\eclipse-workspace\\Selenium\\Screenshot\\snap.png");
		FileUtils.copyFile(srcFile, destFile);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
