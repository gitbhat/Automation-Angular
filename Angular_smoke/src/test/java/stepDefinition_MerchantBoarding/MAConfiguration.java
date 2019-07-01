package stepDefinition_MerchantBoarding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Excel;
import pageObjects.login;
import pageObjects.merchantBoarding;
import stepDefinition_Login.driverinstantiate;

public class MAConfiguration extends driverinstantiate {

	Excel excel;
	login login;
	merchantBoarding mb;
	
	public static String TransactionId;
	public static WebDriverWait d;
	
	WebDriver driver = getDriver(); 
	WebDriverWait wait= new WebDriverWait(driverinstantiate.driver, 50);
	
	
	@Given("Open the Bridgepay URL")
	public void open_the_Bridgepay_URL() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mb=new merchantBoarding(driverinstantiate.driver);
		excel= new Excel("D:/Swetha_project/Angular_smoke/Automationinputs.xlsx");
	 
	 driver.get(excel.getdata(0, 1, 1));
 	Thread.sleep(2000);
 	login = new login(driver);
 	login.Usern().sendKeys(excel.getdata(0, 7, 1));
 	login.Pass().sendKeys(excel.getdata(0, 8, 1));
 	login.btn().click();
 	Thread.sleep(3000);
	}

	@Given("login with Reseller credentials")
	public void login_with_Reseller_credentials() {
	   
	}

	@When("user clicks on Merchant Boarding")
	public void user_clicks_on_Merchant_Boarding() throws Throwable {
		/*mb=new merchantBoarding(driverinstantiate.driver);
		wait.until(ExpectedConditions.elementToBeClickable( mb.merchantboarding())).click();
		wait.until(ExpectedConditions.elementToBeClickable( mb.mgTab())).click();
		wait.until(ExpectedConditions.elementToBeClickable( mb.editMG())).click();
		wait.until(ExpectedConditions.elementToBeClickable( mb.maTab())).click();
		wait.until(ExpectedConditions.elementToBeClickable( mb.editMA())).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable( mb.processingApplication())).click();
		Thread.sleep(3000);
		 wait.until(ExpectedConditions.elementToBeClickable( mb.selectVT())).click();
		
		wait.until(ExpectedConditions.elementToBeClickable( mb.savebtn())).click();*/
	}

	@When("select the Merchant Account")
	public void select_the_Merchant_Account() throws Exception {
		mb=new merchantBoarding(driverinstantiate.driver);
		wait.until(ExpectedConditions.elementToBeClickable( mb.merchantboarding())).click();
		wait.until(ExpectedConditions.elementToBeClickable( mb.mgTab())).click();
		wait.until(ExpectedConditions.elementToBeClickable( mb.editMG())).click();
		wait.until(ExpectedConditions.elementToBeClickable( mb.maTab())).click();
		wait.until(ExpectedConditions.elementToBeClickable( mb.editMA())).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable( mb.processors())).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable( mb.createProcessor())).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable( mb.processorType())).click();
		Thread.sleep(2000);
		Select type= new Select(mb.processorType());
		type.selectByVisibleText("ACH");
		System.out.println("Im in processors1");
		
		Select processor= new Select(mb.processorSelect());
		Thread.sleep(5000);
		System.out.println("Im in processors2");
		processor.selectByVisibleText("BridgePay Test");
		wait.until(ExpectedConditions.elementToBeClickable(mb.saveProcessor())).click();
		Thread.sleep(2000);
	}

	@When("Configure the Merchant Account processors")
	public void configure_the_Merchant_Account_processors() {
	   
	    throw new cucumber.api.PendingException();
	}

	@Then("Merchant Account is configured successfully")
	public void merchant_Account_is_configured_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	
	
}
