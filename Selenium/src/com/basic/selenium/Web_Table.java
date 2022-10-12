package com.basic.selenium;

import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://letcode.in/table");

		List<WebElement> thead = driver.findElements(By.xpath("//table[@id='shopping']/thead/tr"));
		for (WebElement head : thead) {
			System.out.println(head.getText());
		}

		List<WebElement> all_Body = driver.findElements(By.xpath("//table[@id='shopping']/tbody/tr/td"));
		for (WebElement body : all_Body) {
			System.out.println(body.getText());
		}

		List<WebElement> columnItems = driver.findElements(By.xpath("//table[@id='shopping']/tbody/tr/td[1]"));
		for (WebElement items : columnItems) {
			System.out.println(items.getText());
		}

		WebElement particularData = driver.findElement(By.xpath("//table[@id='shopping']/tbody/tr[3]/td[1]"));
		System.out.println(particularData.getText());

		List<WebElement> tfoot = driver.findElements(By.xpath("//table[@id='shopping']/tfoot/td"));
		for (WebElement foot : tfoot) {
			System.out.println(foot.getText());
		}

		WebElement webElement = driver.findElement(By.xpath("//table[@name='table']/tbody/tr[2]/td[4]"));
		webElement.findElement(By.xpath("//input[@id='second']")).click();
		
		

	}
}
