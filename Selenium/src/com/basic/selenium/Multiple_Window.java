package com.basic.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_Window {

	public static WebDriver driver;

	public static void down_And_Enter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void right_Click(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.contextClick(e).build().perform();

	}

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");

		WebElement bestSeller = driver.findElement(By.xpath("//a//preceding-sibling::a[text()='Best Sellers']"));
		right_Click(driver, bestSeller);
		down_And_Enter();

		WebElement mobiles = driver.findElement(By.xpath("//a/following-sibling::a[text()='Mobiles']"));
		right_Click(driver, mobiles);
		down_And_Enter();

		WebElement books = driver.findElement(By.xpath("//div[@id='nav-xshop']//child::a[text()='Books']"));
		right_Click(driver, books);
		down_And_Enter();

		WebElement electronics = driver.findElement(By.xpath("//script//following-sibling::a[.=' Electronics ']"));
		right_Click(driver, electronics);
		down_And_Enter();

	}
}
