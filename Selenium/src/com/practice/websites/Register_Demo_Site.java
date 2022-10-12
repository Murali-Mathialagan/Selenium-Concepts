package com.practice.websites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register_Demo_Site {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Murali");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mariyan");
		driver.findElement(By.xpath("//textarea[contains(@class,'form-control')]")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("muralimariyan8@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("7708324140");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		driver.findElement(By.xpath("//div[contains(@class,'ui-widget')]")).click();
		WebElement skills = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
		Select s1 = new Select(skills);
		s1.selectByValue("Java");
		driver.findElement(By.xpath("(//select[@type='text'])[2]")).click();
		driver.findElement(By.xpath("(//span[contains(@class,'select2')])[1]")).click();
		WebElement year = driver.findElement(By.xpath("(//select[@type='text'])[3]"));
		Select s3 = new Select(year);
		s3.selectByValue("1997");
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s4 = new Select(month);
		s4.selectByVisibleText("March");
		WebElement day = driver.findElement(By.xpath("(//select[@type='text'])[5]"));
		Select s5 = new Select(day);
		s5.selectByIndex(24);
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Murali@25");
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Murali@25");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
