package com.basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Methods {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");

		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		Select s = new Select(day);
		s.selectByIndex(24);

		WebElement month = driver.findElement(By.xpath("//select[contains(@name,'month')]"));
		Select s1 = new Select(month);
		s1.selectByValue("3");

		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1997");
		
		s.isMultiple();
		
		s.getOptions();

		s.getAllSelectedOptions();
		
		s.getFirstSelectedOption();


	}

}