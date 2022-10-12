package com.practice.websites;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Your_Logo_Dynamic_Xpath {
	public static WebDriver driver;

	public static void move(WebDriver d, WebElement e) {
		Actions a = new Actions(d);
		a.moveToElement(e).build().perform();
	}

	public static void webSite_Launch() {
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//nav/descendant::a[@class='login']")).click();
		driver.findElement(By.xpath("//body/descendant::input[@id='email']")).sendKeys("muralimariyan8@gmail.com");
		driver.findElement(By.xpath("//body/descendant::input[@id='passwd']")).sendKeys("Abcd@123");
		driver.findElement(By.xpath("//button/descendant::i[@class='icon-lock left']")).click();
	}

	public static void women_Casual_Dress() {

		WebElement women = driver.findElement(By.xpath("//ul/preceding-sibling::a[.='Women']"));
		Actions a = new Actions(driver);
		a.moveToElement(women).build().perform();
		driver.findElement(By.xpath("//a/preceding::a[@title='Casual Dresses' and .='Casual Dresses'][2]")).click();
		driver.findElement(By.xpath("//ul/following::i[@class='icon-th-list']")).click();
		driver.findElement(By.xpath("//a/child::span[.='More']")).click();
		WebElement plus = driver.findElement(By.xpath("//i/following::i[@class='icon-plus']"));
		a.doubleClick(plus).build().perform();
		driver.findElement(By.xpath("//option/following-sibling::option[.='M']")).click();
		driver.findElement(By.xpath("//button/child::span[text()='Add to cart']")).click();
		driver.findElement(By.xpath("//i/parent::span[normalize-space()='Proceed to checkout']")).click();
		WebElement total = driver.findElement(By.xpath("//th/following-sibling::th[.='Total']"));
		System.out.println(total.getText());
		List<WebElement> tfoot = driver.findElements(By.xpath("//table/tfoot/tr/td"));
		for (WebElement data : tfoot) {
			System.out.println(data.getText());
		}
		driver.findElement(By.xpath("//i/parent::span[.='Proceed to checkout']")).click();
		WebElement text = driver.findElement(By.xpath("//textarea/preceding-sibling::label"));
		System.out.println(text.getText());
		driver.findElement(By.xpath("//button/child::span[.='Proceed to checkout']")).click();
		driver.findElement(By.xpath("//span/child::input[@id='cgv']")).click();
		driver.findElement(By.xpath("//span/parent::button[@type='submit' and @name='processCarrier']")).click();
		driver.findElement(By.xpath("//p/child::a[@title='Pay by check.']")).click();
		driver.findElement(By.xpath("//button/child::span[.='I confirm my order']")).click();
		driver.findElement(By.xpath("//i//parent::a[.='Back to orders']")).click();
		driver.findElement(By.xpath("//a//child::span[.=' Home']")).click();
	}

	public static void dresses_Casual_Dress() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement dresses = driver.findElement(By.xpath("//a[.='Dresses']//following::a[.='Dresses']"));
		move(driver, dresses);
		driver.findElement(By.xpath("//a[.='Casual Dresses']//following::a[.='Casual Dresses']")).click();
		WebElement img = driver.findElement(By.xpath("//a//child::img[@alt='Printed Dress']"));
		move(driver, img);
		WebElement view = driver.findElement(By.xpath("//a//child::span[.='Quick view']"));
		view.click();
		WebElement iframe = driver.findElement(By.xpath("//div//child::iframe"));
		driver.switchTo().frame(iframe);
		WebElement quantity = driver.findElement(By.xpath("//span//child::i[@class='icon-plus']"));
		quantity.click();
		WebElement size = driver.findElement(By.xpath("//select//child::option[.='M']"));
		size.click();
		WebElement addToCart = driver.findElement(By.xpath("//button//child::span[.='Add to cart']"));
		addToCart.click();
		WebElement checkOut = driver.findElement(By.xpath("//a//child::span[normalize-space()='Proceed to checkout']"));
		checkOut.click();
		WebElement checkOut2 = driver.findElement(By.xpath("//i//parent::span[.='Proceed to checkout']"));
		checkOut2.click();
		WebElement checkOut3 = driver.findElement(By.xpath("//button//child::span[.='Proceed to checkout']"));
		checkOut3.click();
		WebElement cgv = driver.findElement(By.xpath("//input[@id='cgv']"));
		cgv.click();
		WebElement checkOut4 = driver
				.findElement(By.xpath("//button//child::span[normalize-space()='Proceed to checkout']"));
		checkOut4.click();
		WebElement payment = driver.findElement(By.xpath("//span//parent::a[@title='Pay by bank wire']"));
		payment.click();
		WebElement confirm = driver.findElement(By.xpath("//i//parent::span[.='I confirm my order']"));
		confirm.click();
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sblue\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		webSite_Launch();
		dresses_Casual_Dress();
		
	}

}
