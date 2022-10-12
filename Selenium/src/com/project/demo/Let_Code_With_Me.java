package com.project.demo;

import java.util.List;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Let_Code_With_Me {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://letcode.in/test");
		driver.manage().window().maximize();

		WebElement input = driver.findElement(By.xpath("(//a[@class='card-footer-item'])[1]"));
		a.moveToElement(input).click().build().perform();

		WebElement name = driver.findElement(By.xpath("//input[@id='fullName']"));
		name.sendKeys("Murali Mathiyalagan");

		WebElement tab = driver.findElement(By.xpath("//input[@id='join']"));
		tab.sendKeys(Keys.TAB);

		WebElement get = driver.findElement(By.xpath("//input[@id='getMe']"));
		String value = get.getAttribute("Value");
		System.out.println(value);

		WebElement clear = driver.findElement(By.xpath("//input[@id='clearMe']"));
		clear.clear();

		WebElement enable = driver.findElement(By.xpath("//input[@id='noEdit']"));
		boolean enabled = enable.isEnabled();
		System.out.println(enabled);

		WebElement check = driver.findElement(By.xpath("//input[@id='dontwrite']"));
		String equals = check.getAttribute("value");
		boolean contains = equals.contains("This text is readonly");
		System.out.println(contains);

		driver.navigate().back();

		WebElement button = driver.findElement(By.xpath("//a[text()='Click']"));
		button.click();

		WebElement gohome = driver.findElement(By.xpath("//button[text()='Goto Home']"));
		gohome.click();

		driver.navigate().back();

		WebElement location = driver.findElement(By.xpath("//button[text()='Find Location']"));
		Point xy = location.getLocation();
		System.out.println(xy);

		WebElement color = driver.findElement(By.xpath("//button[@id='color']"));
		String cssValue = color.getCssValue("background-color");
		System.out.println(cssValue);

		WebElement property = driver.findElement(By.xpath("//button[@id='property']"));
		Dimension size = property.getSize();
		System.out.println(size);

		WebElement disable = driver.findElement(By.xpath("//button[.='Disabled']"));
		boolean enabled2 = disable.isEnabled();
		System.out.println(enabled2);

		WebElement hold = driver.findElement(By.xpath("//button[.='Button Hold!']"));
		a.clickAndHold(hold).build().perform();

		driver.navigate().back();

		WebElement dropDown = driver.findElement(By.xpath("//a[text()='Drop-Down']"));
		dropDown.click();

		WebElement fruits = driver.findElement(By.xpath("//select[@id='fruits']"));
		Select s = new Select(fruits);
		s.selectByVisibleText("Apple");

		WebElement heros = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select s2 = new Select(heros);
		if (s2.isMultiple()) {
			List<WebElement> options = s2.getOptions();
			for (int i = 0; i < options.size(); i++) {
				if (options.get(i).getText().equals("The Avengers") || options.get(i).getText().equals("Batman")
						|| options.get(i).getText().equals("Captain America")) {
					s2.selectByIndex(i);
				}
			}
		} else {
			System.out.println("single dropdown");
		}
		
		WebElement lang = driver.findElement(By.xpath("//select[@id='lang']"));
		Select s3 = new Select(lang);
		s3.selectByVisibleText("C#");
		List<WebElement> all_Options = s3.getOptions();
		for (int i = 0; i < all_Options.size(); i++) {
			String text = all_Options.get(i).getText();
			System.out.println(text);
		}
		
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Select s4 = new Select(country);
		s4.selectByValue("India");
		List<WebElement> allSelectedOptions = s4.getAllSelectedOptions();
		for (WebElement selectedoption : allSelectedOptions) {
			System.out.println(selectedoption.getText());
		}
		
		driver.navigate().back();
		
		WebElement alert = driver.findElement(By.xpath("//a[text()='Dialog']"));
		alert.click();
		
		WebElement simpleAlert = driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		simpleAlert.click();
		driver.switchTo().alert().accept();
		
		WebElement confirmAlert = driver.findElement(By.xpath("//button[text()='Confirm Alert']"));
		confirmAlert.click();
		driver.switchTo().alert().dismiss();
		String text = confirmAlert.getText();
		System.out.println(text);
		
		WebElement promptAlert = driver.findElement(By.xpath("//button[text()='Prompt Alert']"));
		promptAlert.click();
		driver.switchTo().alert().sendKeys("Murali");
		driver.switchTo().alert().accept();
		
		WebElement modernAlert = driver.findElement(By.xpath("//button[text()='Modern Alert']"));
		modernAlert.click();
		WebElement close = driver.findElement(By.xpath("//button[@aria-label='close']"));
		close.click();
		
		driver.navigate().back();
		
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
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[.='Toggle']")).click();
		driver.findElement(By.xpath("//input[@id='yes']")).click();
		
	}

}
