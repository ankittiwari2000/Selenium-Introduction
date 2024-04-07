package MiscellaneousTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver_win32\\chromedriver.exe");
		// ChromeOptions is a class to handle this error
		
		
		//ChromeOptions options = new ChromeOptions();
		//options.setAcceptInsecureCerts(true);
		//WebDriver driver = new ChromeDriver(options);
		
		FirefoxOptions options1 = new FirefoxOptions();
		options1.setAcceptInsecureCerts(true);
		WebDriver driver = new FirefoxDriver(options1);
		
		
		
		driver.get("https://expired.badssl.com");
		System.out.println(driver.getTitle());

	}

}
