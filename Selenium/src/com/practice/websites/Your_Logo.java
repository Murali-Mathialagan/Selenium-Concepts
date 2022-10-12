package com.practice.websites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Your_Logo {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		Thread.sleep(2000);

		driver.manage().window().maximize();

		driver.findElement(By.linkText("Sign in")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[contains(@class,'is_required')])[1]"))
				.sendKeys("muralimariyan@gmail.com");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[normalize-space()='Create an account']")).click();

		Thread.sleep(7000);

		driver.findElement(By.xpath("//div[normalize-space()='Mr.']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Murali");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("M");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Abcd@123");
		Thread.sleep(2000);

		WebElement days = driver.findElement(By.xpath("//select[@name='days']"));
		Select s1 = new Select(days);
		s1.selectByValue("25");

		WebElement months = driver.findElement(By.xpath("//select[@id='months']"));
		Select s2 = new Select(months);
		s2.selectByIndex(3);

		WebElement years = driver.findElement(By.xpath("//select[@name='years']"));
		Select s3 = new Select(years);
		s3.selectByValue("1997");

		driver.findElement(By.xpath("//label[contains(text(),'Sign up')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Receive')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Greens");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Texas");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("USA");
		Thread.sleep(2000);

		WebElement state = driver.findElement(By.xpath("//select[@name='id_state']"));
		Select s4 = new Select(state);
		s4.selectByValue("43");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("12345");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='phone_mobile']")).sendKeys("7708324140");
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

	}
}
