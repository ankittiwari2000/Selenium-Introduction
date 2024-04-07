package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//input[@name='name'][1]")).sendKeys("Ankit Tiwari");
		driver.findElement(By.xpath("//input[@name='email'][1]")).sendKeys("contact@rahulshettyacademy.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("abcd1234");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select abc = new Select(dropdown);
		abc.selectByVisibleText("Female");
		//driver.findElement(By.id("exampleFormControlSelect1")).click();
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.className("form-control")).sendKeys("01/07/2000");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class*='alert-success']")).getText());

	}

}
