package com.practice.websites;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCode_Webtable {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/table");
		Thread.sleep(2000);

		List<WebElement> thead = driver.findElements(By.xpath("//table[contains(@class,'mat-sort table')]/thead"));
		for (int i = 0; i < thead.size(); i++) {
			String text = thead.get(i).getText();
			System.out.println(text);
		}
		Thread.sleep(2000);

		System.out.println("rows - Taken 2 data");
		List<WebElement> tbody = driver.findElements(By.xpath("//table[contains(@class,'mat-sort table')]/tr[2]/td"));
		for (int i = 0; i < tbody.size(); i++) {
			String text = tbody.get(i).getText();
			if (text.equals("Ice cream")||text.equals("237") || text.equals("4")) {
				System.out.println(text);
			}
		}
		Thread.sleep(2000);
		System.out.println("Column - taken 3 data");
		List<WebElement> column = driver.findElements(By.xpath("//table[contains(@class,'mat-sort table')]/tr/td[6]"));
		for (int i = 0; i < column.size(); i++) {
			String text2 = column.get(i).getText();
			if (text2.equals("80") || text2.equals("70") || text2.equals("60")) {
				System.out.println(text2);
			}
		}
	}
}
