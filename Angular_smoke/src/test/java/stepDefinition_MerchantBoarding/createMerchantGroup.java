package stepDefinition_MerchantBoarding;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
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

public class createMerchantGroup extends driverinstantiate {
	
	//public static WebDriver driver;
	Properties p=new Properties();
	Excel excel;
	login login;
	merchantBoarding mb;
	
	public static String TransactionId;
	public static WebDriverWait d;
	
	WebDriver driver= getDriver();
	WebDriverWait wait= new WebDriverWait(driverinstantiate.driver, 100);
	
	@Given("^user has clicked on Merchant Group tab$")
	public void user_has_clicked_on_Merchant_Group_tab() throws InterruptedException {
		
		mb=new merchantBoarding(driverinstantiate.driver);
		//excel= new Excel("D:/Swetha_project/Angular_smoke/Automationinputs.xlsx");
		System.out.println("Im in merchant group creation");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Actions actions = new Actions(driver);
		//actions.moveToElement(mb.mgTab()).click().build().perform();
		Thread.sleep(9000);
		wait.until(ExpectedConditions.elementToBeClickable(mb.mgTab())).click();
		 
		
	}
	
	@When("^Click on close$")
	public void Click_on_close() throws Throwable {
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(mb.closebtn())).click();
		
	}
	
	
	//MG under Reseller Creation
	
	@When("^create Merchant Group under Reseller$")
	public void create_Merchant_Group_under_Reseller() throws Throwable {
		
		mb=new merchantBoarding(driverinstantiate.driver);
		excel= new Excel("D:/Swetha_project/Angular_smoke/Automationinputs.xlsx");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(mb.mgCreate())).click();
		 Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(mb.mgbusinessName())).sendKeys(excel.getdata(1, 1, 16));
		 wait.until(ExpectedConditions.elementToBeClickable( mb.mgfirstName())).sendKeys(excel.getdata(1, 2, 16));
		 wait.until(ExpectedConditions.elementToBeClickable( mb.mgAdd1())).sendKeys(excel.getdata(1, 3, 16));
	    mb.mgBizPhone1().sendKeys(excel.getdata(1, 4, 16));
	    mb.mgEmail().sendKeys(excel.getdata(1, 5, 16));
	    mb.mgLastName().sendKeys(excel.getdata(1, 6, 16));
	    mb.mgCity().sendKeys(excel.getdata(1, 7, 16));
	    
	    Select  statedropdown = new Select (mb.mgState());
	    statedropdown.selectByIndex(10);
	    
	    Select countrydropdown = new Select (mb.mgCountry());
	    countrydropdown.selectByIndex(1);
	     
	    mb.mgZipcode().sendKeys(excel.getdata(1, 8, 16));
	    
	    Select timezonedropdown = new Select (mb.mgTimezone());
	    timezonedropdown.selectByIndex(1);
	    
	    if(mb.mgNext().isEnabled())
	    {	    
	    mb.mgNext().click();
	    }
	    
	    else
	    	System.out.println("Next button is disabled");
	}

	@When("^Reseller Merchant Group default user creation$")
	public void Reseller_Merchant_Group_default_user_creation() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mb=new merchantBoarding(driverinstantiate.driver);
	    mb.mgUserFirstName().sendKeys(excel.getdata(1, 10, 16));
	   mb.mgUserName().clear();
	    mb.mgUserName().sendKeys(excel.getdata(1, 11, 16));
	    mb.mgUserPassword().clear();
	    mb.mgUserPassword().sendKeys(excel.getdata(1, 12, 16));
	    mb.mgUserlastName().sendKeys(excel.getdata(1, 13, 16));
	    mb.mgUseremail().clear();
	    mb.mgUseremail().sendKeys(excel.getdata(1, 14, 16));
	    mb.mgConfirmPassword().clear();
	    mb.mgConfirmPassword().sendKeys(excel.getdata(1, 12, 16));
	    
	    if(mb.mgSavebtn().isEnabled())
	    {
	    mb.mgSavebtn().click();
	    }
	    
	    else {
	    	System.out.println("Save button is disabled");
	    }
	    
	}
	
	@When ("^Reseller Merchant Group regular user creation$")
	public void Reseller_Merchant_Group_regular_user_creation() throws Throwable{
		Thread.sleep(3000);
		// Code to scroll up the page vertically
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable( mb.maUsersTab())).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(mb.maCreateUsers())).click();
		Thread.sleep(2000);
		 mb.maUserFirstName().sendKeys(excel.getdata(1, 16, 16));
		   mb.maUserName().clear();
		    mb.maUserName().sendKeys(excel.getdata(1, 17, 16));
		    mb.maUserPassword().clear();
		    mb.maUserPassword().sendKeys(excel.getdata(1, 18, 16));
		    mb.maUserlastName().sendKeys(excel.getdata(1, 19, 16));
		    mb.maUseremail().clear();
		    mb.maUseremail().sendKeys(excel.getdata(1, 20, 16));
		    mb.maConfirmPassword().clear();
		    mb.maConfirmPassword().sendKeys(excel.getdata(1, 18, 16));
		    
		    if(mb.maSavebtn().isEnabled())
		    {
		    mb.maSavebtn().click();
		    System.out.println("MerchantGroup regular user is created successfully");
		    Thread.sleep(2000);
		    }
		    
		    else {
		    	
		    	System.out.println("Save button is disabled");
		    }
		  
		
	}
	

	@Then("^Reseller Merchant Group with Default user is created successfully$")
	public void Reseller_Merchant_Group_with_Default_user_is_created_successfully() {
		System.out.println("Merchant Group with default user is created successfully");
	   
	}

	
	
	
	
	
	
	
	// Merchant Group under SA creation

	@When("^create Merchant Group$")
	public void create_Merchant_Group() throws Throwable {
		
		mb=new merchantBoarding(driverinstantiate.driver);
		excel= new Excel("D:/Swetha_project/Angular_smoke/Automationinputs.xlsx");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(mb.mgCreate())).click();
		 Thread.sleep(2000);
		 wait.until(ExpectedConditions.elementToBeClickable(mb.mgbusinessName())).sendKeys(excel.getdata(1, 1, 9));
		 wait.until(ExpectedConditions.elementToBeClickable( mb.mgfirstName())).sendKeys(excel.getdata(1, 2, 9));
		 wait.until(ExpectedConditions.elementToBeClickable( mb.mgAdd1())).sendKeys(excel.getdata(1, 3, 9));
	    mb.mgBizPhone1().sendKeys(excel.getdata(1, 4, 9));
	    mb.mgEmail().sendKeys(excel.getdata(1, 5, 9));
	    mb.mgLastName().sendKeys(excel.getdata(1, 6, 9));
	    mb.mgCity().sendKeys(excel.getdata(1, 7, 9));
	    
	    Select  statedropdown = new Select (mb.mgState());
	    statedropdown.selectByIndex(10);
	    
	    Select countrydropdown = new Select (mb.mgCountry());
	    countrydropdown.selectByIndex(1);
	     
	    mb.mgZipcode().sendKeys(excel.getdata(1, 8, 9));
	    
	    Select timezonedropdown = new Select (mb.mgTimezone());
	    timezonedropdown.selectByIndex(1);
	    
	    if(mb.mgNext().isEnabled())
	    {	    
	    mb.mgNext().click();
	    }
	    
	    else
	    	System.out.println("Next button is disabled");
	}

	@When("^Merchant Group default user creation$")
	public void Merchant_Group_default_user_creation() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mb=new merchantBoarding(driverinstantiate.driver);
	    mb.mgUserFirstName().sendKeys(excel.getdata(1, 10, 9));
	   mb.mgUserName().clear();
	    mb.mgUserName().sendKeys(excel.getdata(1, 11, 9));
	    mb.mgUserPassword().clear();
	    mb.mgUserPassword().sendKeys(excel.getdata(1, 12, 9));
	    mb.mgUserlastName().sendKeys(excel.getdata(1, 13, 9));
	    mb.mgUseremail().clear();
	    mb.mgUseremail().sendKeys(excel.getdata(1, 14, 9));
	    mb.mgConfirmPassword().clear();
	    mb.mgConfirmPassword().sendKeys(excel.getdata(1, 12, 9));
	    
	    if(mb.mgSavebtn().isEnabled())
	    {
	    mb.mgSavebtn().click();
	    }
	    
	    else {
	    	System.out.println("Save button is disabled");
	    }
	    
	}
	
	@When ("^Merchant Group regular user creation$")
	public void Merchant_Group_regular_user_creation() throws Throwable{
		Thread.sleep(3000);
		// Code to scroll up the page vertically
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable( mb.maUsersTab())).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(mb.maCreateUsers())).click();
		Thread.sleep(2000);
		 mb.maUserFirstName().sendKeys(excel.getdata(1, 16, 9));
		   mb.maUserName().clear();
		    mb.maUserName().sendKeys(excel.getdata(1, 17, 9));
		    mb.maUserPassword().clear();
		    mb.maUserPassword().sendKeys(excel.getdata(1, 18, 9));
		    mb.maUserlastName().sendKeys(excel.getdata(1, 19, 9));
		    mb.maUseremail().clear();
		    mb.maUseremail().sendKeys(excel.getdata(1, 20, 9));
		    mb.maConfirmPassword().clear();
		    mb.maConfirmPassword().sendKeys(excel.getdata(1, 18, 9));
		    
		    if(mb.maSavebtn().isEnabled())
		    {
		    mb.maSavebtn().click();
		    System.out.println("MerchantGroup regular user is created successfully");
		    Thread.sleep(2000);
		    }
		    
		    else {
		    	
		    	System.out.println("Save button is disabled");
		    }
		  
		
	}
	

	@Then("^Merchant Group with Default user is created successfully$")
	public void Merchant_Group_with_Default_user_is_created_successfully() {
		System.out.println("Merchant Group with default user is created successfully");
	   
	}



}
