package Hook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hook {
public static WebDriver driver;
	
	
	@Before
	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\Capgworkspace\\Capgeminiday1\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		    driver.get("http://realty-real-estatem1.upskills.in/admin");
	
	}
	
	@After
	public void closedriver()
	{
		System.out.println("Bowser is closing now");
		driver.quit();
	}
}
