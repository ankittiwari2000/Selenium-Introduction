package Locators;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException{
		/*System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));*/
		
		//Firefox launch
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium Webdriver\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Ankit");
		driver.findElement(By.name("inputPassword")).sendKeys("akt172000");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ankit");
		driver.findElement(By.cssSelector("input[placeholder=\"Email\"]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).clear();
		driver.findElement(By.xpath("//input[@type=\"text\"][2]")).sendKeys("akt172000@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234565431");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		driver.findElement(By.cssSelector("button[class*='go']")).click();
		Thread.sleep(1000);	
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Ankit");
		driver.findElement(By.xpath("//input[contains(@type,'pass')]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		

	}

}
