package stepDefinition_MerchantBoarding;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
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

public class createMerchantAccount extends driverinstantiate {
	
	//public static WebDriver driver;
	Properties p=new Properties();
	Excel excel;
	login login;
	merchantBoarding mb;
	
	public static String TransactionId;
	public static WebDriverWait d;
	
	WebDriver driver= getDriver();
	WebDriverWait wait= new WebDriverWait(driverinstantiate.driver, 200);
	
	@Given("^user has clicked on Merchant Account tab$")
	public void user_has_clicked_on_Merchant_Account_tab() throws InterruptedException {
		
		mb=new merchantBoarding(driverinstantiate.driver);
		excel= new Excel("D:/Swetha_project/Angular_smoke/Automationinputs.xlsx");
		System.out.println("Im in merchant account creation");
		
		Thread.sleep(9000);
		// Code to scroll up the page vertically
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(5000);
		 wait.until(ExpectedConditions.elementToBeClickable( mb.maTab())).click();
	
		
	}

	@When("^create Merchant Account$")
	public void create_Merchant_Account() throws Throwable {
		
		mb=new merchantBoarding(driverinstantiate.driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000);
		 wait.until(ExpectedConditions.elementToBeClickable( mb.maCreate())).click();
		 wait.until(ExpectedConditions.elementToBeClickable( mb.mabusinessName())).sendKeys(excel.getdata(1, 1, 13));
		 wait.until(ExpectedConditions.elementToBeClickable( mb.mafirstName())).sendKeys(excel.getdata(1, 2, 13));
		 wait.until(ExpectedConditions.elementToBeClickable(  mb.maAdd1())).sendKeys(excel.getdata(1, 3, 13));
		 wait.until(ExpectedConditions.elementToBeClickable( mb.maBizPhone1())).sendKeys(excel.getdata(1, 4, 13));
		 wait.until(ExpectedConditions.elementToBeClickable( mb.maEmail())).sendKeys(excel.getdata(1, 5, 13));
		 wait.until(ExpectedConditions.elementToBeClickable(mb.maLastName())).sendKeys(excel.getdata(1, 6, 13));
		 wait.until(ExpectedConditions.elementToBeClickable( mb.maCity())).sendKeys(excel.getdata(1, 7, 13));
	    
	    Select  statedropdown = new Select (mb.maState());
	    statedropdown.selectByIndex(10);
	    
	    Select countrydropdown = new Select (mb.maCountry());
	    countrydropdown.selectByIndex(1);
	     
	    mb.maZipcode().sendKeys(excel.getdata(1, 8, 13));
	    
	    Select timezonedropdown = new Select (mb.maTimezone());
	    timezonedropdown.selectByIndex(1);
	    
	    if(mb.maNext().isEnabled())
	    {	    
	    mb.maNext().click();
	    }
	    
	    else
	    	System.out.println("Next button is disabled");
	}

	@When("^Merchant Account default user creation$")
	public void Merchant_Account_default_user_creation() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mb=new merchantBoarding(driverinstantiate.driver);
	    mb.maUserFirstName().sendKeys(excel.getdata(1, 10, 13));
	   mb.maUserName().clear();
	    mb.maUserName().sendKeys(excel.getdata(1, 11, 13));
	    mb.maUserPassword().clear();
	    mb.maUserPassword().sendKeys(excel.getdata(1, 12, 13));
	    mb.maUserlastName().sendKeys(excel.getdata(1, 13, 13));
	    mb.maUseremail().clear();
	    mb.maUseremail().sendKeys(excel.getdata(1, 14, 13));
	    mb.maConfirmPassword().clear();
	    mb.maConfirmPassword().sendKeys(excel.getdata(1, 12, 13));
	    
	    if(mb.maSavebtn().isEnabled())
	    {
	    mb.maSavebtn().click();
	    }
	    
	    else {
	    	
	    	System.out.println("Save button is disabled");
	    }
	    
	}
	
	@When("^configure Merchant Account details$")
	public void configure_Merchant_Account_details() throws Throwable {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		mb=new merchantBoarding(driverinstantiate.driver);
		// Code to scroll up the page vertically
				JavascriptExecutor js = (JavascriptExecutor) driver;
				// This  will scroll up the page by  1000 pixel vertical		
		        js.executeScript("window.scrollBy(0,-1000)");
		        Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable( mb.processingApplication())).click();
		Thread.sleep(3000);
		 wait.until(ExpectedConditions.elementToBeClickable( mb.selectVT())).click();
		 Thread.sleep(3000);
		// Code to scroll up the page vertically
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			// This  will scroll up the page by  1000 pixel vertical		
	        js.executeScript("window.scrollBy(0,1000)");
	        Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable( mb.savebtn())).click();
		 Thread.sleep(5000);
		 js.executeScript("window.scrollBy(0,-1000)");
		System.out.println("Im going to click processors");
		Thread.sleep(9000);
		wait.until(ExpectedConditions.elementToBeClickable( mb.processors())).click();
		Thread.sleep(8000);
		System.out.println("Im in processors");
		wait.until(ExpectedConditions.elementToBeClickable( mb.createProcessor())).click();
		Thread.sleep(8000);
		Select type= new Select(mb.processorType());
		Thread.sleep(2000);
		type.selectByVisibleText("ACH");
		System.out.println("Im in processors ACH");
		
		Select processor= new Select(mb.processorSelect());
		Thread.sleep(5000);
		System.out.println("I selected the processor");
		processor.selectByVisibleText("BridgePay Test");
		wait.until(ExpectedConditions.elementToBeClickable(mb.saveProcessor())).click();
		Thread.sleep(2000);
		
		/* select Credit Card processor*/
		wait.until(ExpectedConditions.elementToBeClickable( mb.createProcessor())).click();
		Select typeCredit= new Select(mb.processorType());
		typeCredit.selectByVisibleText("Credit Card");
		System.out.println("Im in processors Credit");
		
		Select processorCredit= new Select(mb.processorSelect());
		//Thread.sleep(5000);
		System.out.println("I selected the processor");
		processorCredit.selectByVisibleText("BridgePay Test");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(mb.saveProcessor())).click();
		Thread.sleep(9000);
	}
	
	@When ("^Create Merchant Account Regular user$")
	public void Create_Merchant_Account_Regular_user() throws Throwable{
		wait.until(ExpectedConditions.elementToBeClickable( mb.maUsersTab())).click();
		wait.until(ExpectedConditions.elementToBeClickable(mb.maCreateUsers())).click();
		 mb.maUserFirstName().sendKeys(excel.getdata(1, 16, 13));
		   mb.maUserName().clear();
		    mb.maUserName().sendKeys(excel.getdata(1, 17, 13));
		    mb.maUserPassword().clear();
		    mb.maUserPassword().sendKeys(excel.getdata(1, 18, 13));
		    mb.maUserlastName().sendKeys(excel.getdata(1, 19, 13));
		    mb.maUseremail().clear();
		    mb.maUseremail().sendKeys(excel.getdata(1, 20, 13));
		    mb.maConfirmPassword().clear();
		    mb.maConfirmPassword().sendKeys(excel.getdata(1, 18, 13));
		    
		    if(mb.maSavebtn().isEnabled())
		    {
		    mb.maSavebtn().click();
		    System.out.println("Merchant Account with regular user is created successfully");
		    }
		    
		    else {
		    	
		    	System.out.println("Save button is disabled");
		    }
		
	}

	@Then("^Merchant Account with Default and Regular user is created successfully$")
	public void Merchant_Account_with_Default_and_Regular_user_is_created_successfully() {
		System.out.println("Merchant Account with default user is created successfully");
	   
	}



}
