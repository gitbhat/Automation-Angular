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

public class createSalesAgent extends driverinstantiate {
	
	Properties p=new Properties();
	Excel excel;
	login login;
	merchantBoarding mb;
	
	public static String TransactionId;
	public static WebDriverWait d;
	
	WebDriver driver= getDriver();
	WebDriverWait wait= new WebDriverWait(driverinstantiate.driver, 50);
	
	
	
	@Given("user has clicked on Sales Agent tab")
	public void user_has_clicked_on_Sales_Agent_tab() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mb=new merchantBoarding(driverinstantiate.driver);
		excel= new Excel("D:/Swetha_project/Angular_smoke/Automationinputs.xlsx");
		driver.navigate().refresh();
	 wait.until(ExpectedConditions.elementToBeClickable( mb.saTab())).click();
	 
	  
	}

	@When("^create SalesAgent$")
	public void create_SalesAgent() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mb=new merchantBoarding(driverinstantiate.driver);
		excel= new Excel("D:/Swetha_project/Angular_smoke/Automationinputs.xlsx");
		wait.until(ExpectedConditions.elementToBeClickable( mb.saTab())).click();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable( mb.saCreate())).click();
		Thread.sleep(3000);
	    mb.sabusinessName().sendKeys(excel.getdata(1, 1, 5));
	    mb.safirstName().sendKeys(excel.getdata(1, 2, 5));
	    mb.saAdd1().sendKeys(excel.getdata(1, 3, 5));
	    mb.saBizPhone1().sendKeys(excel.getdata(1, 4, 5));
	    mb.saEmail().sendKeys(excel.getdata(1, 5, 5));
	    mb.saLastName().sendKeys(excel.getdata(1, 6, 5));
	    mb.saCity().sendKeys(excel.getdata(1, 7, 5));
	    
	    Select state = new Select(mb.saState());
	    state.selectByVisibleText("Florida");
	    
	    Select country= new Select (mb.saCountry());
	    country.selectByVisibleText("United States");
	    
	    mb.saZipcode().sendKeys(excel.getdata(1, 8, 5));
	    
	    
	    Select Timezone= new Select (mb.saTimezone());
	    Timezone.selectByIndex(1);
	    
	    if(mb.saNext().isEnabled())
	    {	    
	    mb.saNext().click();
	    }
	    
	    else
	    	System.out.println("Next button is disabled");
	
	  
	   
	}

	@When("^Sales Agent default user creation$")
	public void sales_Agent_default_user_creation() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mb=new merchantBoarding(driverinstantiate.driver);
		excel= new Excel("D:/Swetha_project/Angular_smoke/Automationinputs.xlsx");
		  mb.saUserFirstName().sendKeys(excel.getdata(1, 10, 5));
		   mb.saUserName().clear();
		    mb.saUserName().sendKeys(excel.getdata(1, 11, 5));
		    mb.saUserPassword().clear();
		    mb.saUserPassword().sendKeys(excel.getdata(1, 12, 5));
		    mb.saUserlastName().sendKeys(excel.getdata(1, 13, 5));
		    mb.saUseremail().clear();
		   
		    mb.saUseremail().sendKeys(excel.getdata(1, 14, 5));
		    mb.saUserConfirmPassword().clear();
		    mb.saUserConfirmPassword().sendKeys(excel.getdata(1, 12, 5));
		    
		    if(mb.sasavebtn().isEnabled())
		    		
		    {
		    mb.sasavebtn().click();
		    }
		    
		    else {
		    	System.out.println("Save button is disabled");
		    	
		    }
	}
	
	@When ("^SalesAgent regular user creation$")
	public void SalesAgent_regular_user_creation() throws Throwable{
		Thread.sleep(3000);
		// Code to scroll up the page vertically
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// This  will scroll up the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,-1000)");
		wait.until(ExpectedConditions.elementToBeClickable( mb.maUsersTab())).click();
		wait.until(ExpectedConditions.elementToBeClickable(mb.maCreateUsers())).click();
		 mb.maUserFirstName().sendKeys(excel.getdata(1, 16, 5));
		   mb.maUserName().clear();
		    mb.maUserName().sendKeys(excel.getdata(1, 17, 5));
		    mb.maUserPassword().clear();
		    mb.maUserPassword().sendKeys(excel.getdata(1, 18, 5));
		    mb.maUserlastName().sendKeys(excel.getdata(1, 19, 5));
		    mb.maUseremail().clear();
		    mb.maUseremail().sendKeys(excel.getdata(1, 20, 5));
		    mb.maConfirmPassword().clear();
		    mb.maConfirmPassword().sendKeys(excel.getdata(1, 18, 5));
		    
		    if(mb.maSavebtn().isEnabled())
		    {
		    mb.maSavebtn().click();
		    System.out.println("SalesAgent regular user is created successfully");
		    Thread.sleep(3000);
		    }
		    
		    else {
		    	
		    	System.out.println("Save button is disabled");
		    }
		  
		
	}
	

	@Then("^Sales Agent with Default user is created successfully$")
	public void sales_Agent_with_Default_user_is_created_successfully() {
		System.out.println("Sales Agent with default user is created successfully");
	}



}
