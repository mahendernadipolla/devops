package mahenderdevops.mahenderdevops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mahiclass {
	@Test
	void start() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mahender\\Automation\\mahenderdevops\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://automationtalks.com/");
		String pagesource=driver.getCurrentUrl();
		System.out.println("current URL is ---->" + pagesource);
		driver.close();
		
		
	}

}
