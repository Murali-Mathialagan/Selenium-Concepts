package com.basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concepts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/test");

		WebElement frame = driver.findElement(By.xpath("//a[.='Inner HTML']"));
		frame.click();

		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='firstFr']"));
		driver.switchTo().frame(iframe);
		WebElement fname = driver.findElement(By.xpath("//input[@name='fname']"));
		fname.sendKeys("Murali");
		WebElement lname = driver.findElement(By.xpath("//input[@name='lname']"));
		lname.sendKeys("Mathiyalagan");

		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
		driver.switchTo().frame(innerFrame);
		WebElement mail = driver.findElement(By.xpath("//input[@name='email']"));
		mail.sendKeys("muralimariyan8@gmai.com");

	}

}
