package com.basic.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_DropDown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/dropdowns");

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select s = new Select(dropdown);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);

		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			if (options.get(i).getText().equals("Ant-Man") || options.get(i).getText().equals("The Avengers")) {
				s.selectByIndex(i);
			}
		}
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement sOptions : allSelectedOptions) {
			System.out.println(sOptions.getText());
		}
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());

	}
}
