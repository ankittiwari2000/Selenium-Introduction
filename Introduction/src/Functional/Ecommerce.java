package Functional;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerce {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		
		// array of vegetables name
		String[] veggies = {"Brocolli" , "Cucumber" , "Beans", "Brinjal", "Potato"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver, veggies);
		
		/*If method is not static then we need to create object of the class then only we can able to call that method.
	
		Ecommerce a = new Ecommerce();
		a.addItems(driver, veggies);*/
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//explicit wait
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		

	}
	
	public static void addItems(WebDriver driver, String[] veggies)
	{
		int j=0;
List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size(); i++)
		{
			//Brocolli - 1 Kg
			//Brocolli , 1 Kg
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// first convert array into arraylist for easy search
			
		    List veggiesList = Arrays.asList(veggies);
		    
		 // check whether name you extracted is present in arraylist or not
			
			
			if(veggiesList.contains(formattedName))
			{
				j++;
				// then click on "Add to cart" button
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==veggies.length)
				{
					break;
				}
			}
		}
	}

}
