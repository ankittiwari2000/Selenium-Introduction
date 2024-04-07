package RealTimeExercises;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.path2usa.com/travel-companion/");
		
		// Grab common attribute, put into list & iterate
		
		
		//driver.findElement(By.id("form-field-travel_comp_date")).click();
		List<WebElement> dates = driver.findElements(By.cssSelector(".flatpickr-day.disabled"));
		int count = driver.findElements(By.cssSelector(".flatpickr-day.disabled")).size();
		for(int i=1; i<count; i++)
		{
			String text = driver.findElements(By.cssSelector(".flatpickr-day.disabled")).get(i).getText();
			if(text.equalsIgnoreCase("13"))
			{
				driver.findElements(By.cssSelector(".flatpickr-day.disabled")).get(i).click();
				break;
			}
		}


	}

}
