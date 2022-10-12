package com.practice.websites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spotify {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://open.spotify.com/");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='Log in']")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("login-username")).sendKeys("muralimariyan8@gmail.com");

		Thread.sleep(2000);

		driver.findElement(By.id("login-password")).sendKeys("MVP@2536");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//p[text()='Log In']")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[text()='Search']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[contains(@placeholder,'What do you want')]")).sendKeys("Dhanush songs");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@role='row'])[1]")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[contains(@aria-label,'Play Megham Karukatha')])[1]")).click();

	}
}
