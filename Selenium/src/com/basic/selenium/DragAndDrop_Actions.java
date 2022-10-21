package com.basic.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Actions {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\git\\Selenium\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Actions a = new Actions(driver);

		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement source = driver.findElement(By.xpath("//div[@id='form:drag_content']"));

		WebElement target = driver.findElement(By.xpath("//div[@id='form:drop_content']"));
		
		a.dragAndDrop(source, target).build().perform();

		WebElement box = driver.findElement(By.xpath("(//div[@class='card'])[5]"));
		a.dragAndDrop(source, box).build().perform();

	}
}
