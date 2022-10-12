package com.practice.websites;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin_Dynamic_Xpath {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[@id='username_span']//preceding-sibling::input")).sendKeys("muralimariyan");
		driver.findElement(By.xpath("//td//child::input[@id='password']")).sendKeys("Murali@25");
		driver.findElement(By.xpath("//tr//descendant::input[@id='login']")).click();

		driver.findElement(By.xpath("//select[@id='location']//child::option[@value='London']")).click();
		driver.findElement(By.xpath("//select[@id='hotels']//child::option[@value='Hotel Sunshine']")).click();
		driver.findElement(By.xpath("//select[@id='room_type']//child::option[.='Super Deluxe']")).click();
		driver.findElement(By.xpath("//select[@id='room_nos']//child::option[.='2 - Two']")).click();
		WebElement checkIn = driver.findElement(By.xpath("//tr//descendant::input[@id='datepick_in']"));
		checkIn.clear();
		checkIn.sendKeys("10/09/2022");
		WebElement checkOut = driver
				.findElement(By.xpath("//td[@align='right']//following::input[@id='datepick_out']"));
		checkOut.clear();
		checkOut.sendKeys("15/09/2022");
		driver.findElement(By.xpath("//select[@id='adult_room']//child::option[.='2 - Two']")).click();
		driver.findElement(By.xpath("//select[@id='child_room']//child::option[.='3 - Three']")).click();
		driver.findElement(By.xpath("//input[@id='Reset']//preceding-sibling::input")).click();

		driver.findElement(By.xpath("//td//child::input[@id='radiobutton_0']")).click();
		driver.findElement(By.xpath("//tr//descendant::input[@id='continue']")).click();

		driver.findElement(By.xpath("//span[@class='reg_error']//following::input[@id='first_name']"))
				.sendKeys("Murali");
		driver.findElement(By.xpath("//span[@class='reg_error']//following::input[@id='last_name']"))
				.sendKeys("Mathiyalagan");
		driver.findElement(By.xpath("//label[@id='address_span']//preceding-sibling::textarea"))
				.sendKeys("North America");
		driver.findElement(By.xpath("//td//descendant::input[@id='cc_num']")).sendKeys("1234567891012456");
		driver.findElement(By.xpath("//select[@id='cc_type']//child::option[.='VISA']")).click();
		driver.findElement(By.xpath("//select[@id='cc_exp_month']//child::option[.='March']")).click();
		driver.findElement(By.xpath("//select[@id='cc_exp_year']//child::option[.='2022']")).click();
		driver.findElement(By.xpath("//td//child::input[@id='cc_cvv']")).sendKeys("456");
		driver.findElement(By.xpath("//input[@id='cc_cvv']//following::input[@id='book_now']")).click();

		driver.findElement(By.xpath("//input[@id='search_hotel']//following-sibling::input[@id='my_itinerary']"))
				.click();

		driver.findElement(By.xpath("//table[@class='content']//following::input[@id='logout']")).click();
		
	

	}
}
