package com.basic.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamic_Waits {

	public static WebDriver driver;

	public static void implicitly_Wait() {

		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

		WebElement username = driver.findElement(By.name("emaill"));
		username.sendKeys("muralimariyan8@gmail.com");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement password = driver.findElement(By.id("passs"));
		password.sendKeys("Murali@25359");
	}

	public static void pageLoadTimeout() {

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
		driver.get("https://www.amazon.in/");

	}

	public static void explicitly_Wait() {
		driver.get("https://letcode.in/waits");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//div/child::button")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}

	public static void visible_Conditions() {
		driver.get("https://letcode.in/signin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//head/following::input[@placeholder='Enter registered email' and @name='email']"))
				.sendKeys("Abc");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc");
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();

		WebElement toast = driver.findElement(By.id("toast-container"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(toast));

		WebElement signUp = driver.findElement(By.xpath("//a[.='Sign up']"));

		wait.until(ExpectedConditions.visibilityOf(signUp)).click();

	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		visible_Conditions();

	}
}
