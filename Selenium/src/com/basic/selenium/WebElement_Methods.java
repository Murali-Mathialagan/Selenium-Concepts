package com.basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Methods {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");

		WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
		element.sendKeys("muralimariyan8@");
		
		element.clear();
		element.sendKeys("muralimariyan8@gmail.com");

		WebElement element2 = driver.findElement(By.xpath(""));
		element2.click();

		WebElement text = driver.findElement(By.xpath("//div[text()='Log in to Facebook']"));
		System.out.println(text.getText());

		System.out.println(element.getTagName());

		System.out.println(element.getSize());

		System.out.println(element.getAttribute("name"));

		System.out.println(element.getAttribute("Value"));

		element.getLocation();

		element.getCssValue("");
		
		// Boolean Methods
		
		element.isDisplayed();
		
		element.isEnabled();
		
		element.isSelected();

	}

}
