import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v119.fetch.Fetch;
import org.openqa.selenium.devtools.v119.network.model.ErrorReason;
import org.openqa.selenium.devtools.v120.fetch.model.RequestPattern;


public class NetworkFailedRequest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Webdriver\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		Optional<List<RequestPattern>> patterns = Optional.of(Arrays.asList(new RequestPattern(Optional.of("*GetBook*"), Optional.empty(), Optional.empty())));
		
	   devTools.send(Fetch.enable(patterns, Optional.empty()));
	   devTools.addListener(Fetch.requestPaused(), request->
	   {
		 devTools.send(Fetch.failRequest(request.getRequestId(), ErrorReason.FAILED));
	   });
		

	}

}
