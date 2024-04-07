import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class SetGeoLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		// 40,3
		
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		Map<String, Object> coordinates = new HashMap<String, Object>();
		// 35,104 : china
		// 40,3   : medico spain
		coordinates.put("latitude", 40);
		coordinates.put("longitude", 3);
		coordinates.put("accuracy", 1); 
		
		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
		//driver.findElements(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).get(0).click();
		driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
		
		
		System.out.println(driver.findElement(By.cssSelector(".default-ltr-cache-jpuyb8")).getText());

	}

}
