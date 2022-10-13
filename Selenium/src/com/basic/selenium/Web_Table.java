package com.basic.selenium;

import java.time.Duration;
import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {
	
	
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\git\\Selenium\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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
		
		//3rd table
		
		List<WebElement> thead3 = driver.findElements(By.xpath("//table[contains(@class,'mat-sort table')]//thead//th"));
		for (WebElement head3 : thead3) {
			System.out.println("Table head: " + head3.getText());
		}
		
		List<WebElement> particularRow = driver.findElements(By.xpath("//table[contains(@class,'mat-sort table')]//tr[2]//td"));
		for (WebElement row : particularRow) {
			System.out.println("Particular Row: " + row.getText());
		}
		
		List<WebElement> particularColumn = driver.findElements(By.xpath("//table[contains(@class,'mat-sort table')]//td[1]"));
		for (WebElement column : particularColumn) {
			System.out.println("Particular Column: " + column.getText());
		}
		
		WebElement particularData3 = driver.findElement(By.xpath("//table[contains(@class,'mat-sort table')]//tr[2]//td[1]"));
		System.out.println("particular data:" + particularData3.getText());
	
	}
}
