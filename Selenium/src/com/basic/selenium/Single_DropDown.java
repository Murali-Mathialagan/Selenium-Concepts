package com.basic.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_DropDown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");

		WebElement fruit = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select s = new Select(fruit);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		s.selectByVisibleText("Apple");
		
		WebElement lang = driver.findElement(By.xpath("//select[@id='lang']"));
		Select s1 = new Select(lang);
		s1.selectByValue("sharp");
		
		List<WebElement> options = s1.getOptions();
		for (WebElement allOptions : options) {
			System.out.println(allOptions.getText());
		}
		
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Select s2 = new Select(country);
		s2.selectByValue("India");
		
		List<WebElement> allSelectedOptions = s2.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			System.out.println(allSelectedOptions.get(i).getText());
		}

	}
}
