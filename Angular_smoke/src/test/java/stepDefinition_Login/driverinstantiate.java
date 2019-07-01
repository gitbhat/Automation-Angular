package stepDefinition_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverinstantiate {
	
	public static WebDriver driver;
	
	public WebDriver getDriver(){
		if (driver == null)
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\103343\\Desktop\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver(); 
			driver.manage().window().maximize();
		}
		return driver;
		}
	}


