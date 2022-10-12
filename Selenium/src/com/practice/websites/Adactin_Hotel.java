package com.practice.websites;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Hotel {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		
//		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		d.get("https://adactinhotelapp.com/");

		d.findElement(By.name("username")).sendKeys("muralimariyan");

		d.findElement(By.id("password")).sendKeys("Murali@25");

		d.findElement(By.xpath("//input[@value='Login']")).click();

		WebElement location = d.findElement(By.name("location"));
		Select s1 = new Select(location);
		s1.selectByValue("Sydney");

		WebElement hotels = d.findElement(By.id("hotels"));
		Select s2 = new Select(hotels);
		s2.selectByVisibleText("Hotel Hervey");

		WebElement roomtype = d.findElement(By.name("room_type"));
		Select s3 = new Select(roomtype);
		s3.selectByIndex(3);

		WebElement roomNo = d.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
		Select s4 = new Select(roomNo);
		s4.selectByValue("2");

		WebElement checkin = d.findElement(By.name("datepick_in"));
		checkin.clear();
		checkin.sendKeys("22/08/2022");

		WebElement checkout = d.findElement(By.id("datepick_out"));
		checkout.clear();
		checkout.sendKeys("27/08/2022");

		WebElement adult = d.findElement(By.name("adult_room"));
		Select s5 = new Select(adult);
		s5.selectByValue("4");

		WebElement child = d.findElement(By.id("child_room"));
		Select s6 = new Select(child);
		s6.selectByVisibleText("0 - None");

		d.findElement(By.name("Submit")).click();

		d.findElement(By.xpath("//input[@name='radiobutton_0']")).click();

		d.findElement(By.xpath("//input[@type='submit']")).click();

		d.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Murali");

		d.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Mariyan");

		d.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Chennai");

		d.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567890123456");

		WebElement cardtype = d.findElement(By.xpath("//select[@name='cc_type']"));
		Select s7 = new Select(cardtype);
		s7.selectByValue("MAST");

		WebElement expmonth = d.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s8 = new Select(expmonth);
		s8.selectByVisibleText("March");

		WebElement expyear = d.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s9 = new Select(expyear);
		s9.selectByValue("2014");

		d.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("456");

		d.findElement(By.xpath("//input[@name='book_now']")).click();

		d.findElement(By.name("logout")).click();

		d.findElement(By.partialLinkText("login again")).click();

		// Next Hotel

		d.findElement(By.name("username")).sendKeys("muralimariyan");

		d.findElement(By.id("password")).sendKeys("Murali@25");

		d.findElement(By.xpath("//input[@value='Login']")).click();

		WebElement location1 = d.findElement(By.name("location"));
		Select h1 = new Select(location1);
		h1.selectByValue("Melbourne");

		WebElement hotels1 = d.findElement(By.id("hotels"));
		Select h2 = new Select(hotels1);
		h2.selectByVisibleText("Hotel Sunshine");

		WebElement roomtype1 = d.findElement(By.name("room_type"));
		Select h3 = new Select(roomtype1);
		h3.selectByIndex(3);

		WebElement roomNo1 = d.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
		Select h4 = new Select(roomNo1);
		h4.selectByValue("2");

		WebElement checkin1 = d.findElement(By.name("datepick_in"));
		checkin1.clear();
		checkin1.sendKeys("25/08/2022");

		WebElement checkout1 = d.findElement(By.id("datepick_out"));
		checkout1.clear();
		checkout1.sendKeys("30/08/2022");

		WebElement adult1 = d.findElement(By.name("adult_room"));
		Select h5 = new Select(adult1);
		h5.selectByValue("4");

		WebElement child1 = d.findElement(By.id("child_room"));
		Select h6 = new Select(child1);
		h6.selectByVisibleText("4 - Four");

		d.findElement(By.name("Submit")).click();

		d.findElement(By.xpath("//input[@name='radiobutton_0']")).click();

		d.findElement(By.xpath("//input[@type='submit']")).click();

		d.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Murali");

		d.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Mariyan");

		d.findElement(By.xpath("//textarea[@name='address']")).sendKeys("America");

		d.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567890123456");

		WebElement cardtype1 = d.findElement(By.xpath("//select[@name='cc_type']"));
		Select h7 = new Select(cardtype1);
		h7.selectByValue("MAST");

		WebElement expmonth1 = d.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select h8 = new Select(expmonth1);
		h8.selectByVisibleText("April");

		WebElement expyear1 = d.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select h9 = new Select(expyear1);
		h9.selectByValue("2020");

		d.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("456");

		d.findElement(By.xpath("//input[@name='book_now']")).click();

		d.findElement(By.name("logout")).click();

	}
}
