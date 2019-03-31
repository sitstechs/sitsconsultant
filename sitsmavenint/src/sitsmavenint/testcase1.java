package sitsmavenint;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class testcase1 {
	
	@Test

	public void tc1 ()
	
	
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\al_94\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com");
		driver.findElementByName("firstname").sendKeys("AL");
		driver.quit();
		
		
		
	}
	
	
	
}
