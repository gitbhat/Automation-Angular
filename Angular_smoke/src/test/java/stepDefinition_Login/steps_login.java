package stepDefinition_Login;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

//import Angularsmokesuite.Angular_smoke.Excel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Excel;
import pageObjects.login;


public class steps_login extends driverinstantiate {
	
	
	Properties p=new Properties();
	Excel excel;
	login login;
	
	public static String TransactionId;
	public static WebDriverWait d;
	public static String TransactionType	;
	
	
	WebDriver driver= getDriver();

	@Given("^Open the chrome browser$")
	public void open_the_chrome_browser()
	{
    	excel=new Excel("D:/Swetha_project/Angular_smoke/Automationinputs.xlsx");
    	System.out.println("Open the chrome browser");
    	//System.setProperty("webdriver.chrome.driver","C:\\Users\\103343\\Desktop\\Selenium\\chromedriver.exe");
    	//driver = new ChromeDriver();
    }

    @When("Enter the Angular URL and provide the Admin login details")
    public void Enter_the_Angular_URL_and_provide_the_Admin_login_details() throws Throwable {
    	driver.get(excel.getdata(0, 1, 1));
    	Thread.sleep(2000);
    	login = new login(driver);
    	login.Usern().sendKeys(excel.getdata(0, 4, 1));
    	login.Pass().sendKeys(excel.getdata(0, 5, 1));
    	login.btn().click();
    	Thread.sleep(3000);
    	
    }
    
    @When("^Enter the Angular URL and provide the Reseller login details$")
    public void Enter_the_Angular_URL_and_provide_the_Reseller_login_details() throws Throwable {
    	driver.get(excel.getdata(0, 1, 1));
    	Thread.sleep(2000);
    	login = new login(driver);
    	login.Usern().sendKeys(excel.getdata(0, 14, 1));
    	login.Pass().sendKeys(excel.getdata(0, 15, 1));
    	login.btn().click();
    	Thread.sleep(3000);
    	
    }


    @Then("^Login should be successful$")
    public void Login_should_be_successful() throws InterruptedException {
        System.out.println("Browser launched successfully");
        Thread.sleep(3000);
    }	                            




}
