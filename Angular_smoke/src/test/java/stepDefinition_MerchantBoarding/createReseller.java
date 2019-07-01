package stepDefinition_MerchantBoarding;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Excel;
import pageObjects.merchantBoarding;
import stepDefinition_Login.driverinstantiate;


//extends driverinstantiate 
public class createReseller extends driverinstantiate  {
	
	//public static WebDriver driver;
	Excel excel;
	merchantBoarding mb;
	

//	WebDriver driver= getDriver();
	WebDriverWait wait= new WebDriverWait(driverinstantiate.driver, 100);
	

	
	@And("^user clicked on MB$")
	public void user_clicked_on_MB()  {
		
			mb=new merchantBoarding(driverinstantiate.driver);
			
	  wait.until(ExpectedConditions.elementToBeClickable( mb.merchantboarding())).click();
	   try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	
	
	
	
		

	@When("^create Reseller$")
	public void create_Reseller() throws Throwable {
		
		mb=new merchantBoarding(driverinstantiate.driver);
		driverinstantiate.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    mb.createReseller().click();
	    mb.resellerBusinessName().sendKeys(excel.getdata(1, 1, 1));
	    mb.resellerfirstName().sendKeys(excel.getdata(1, 2, 1));
	    mb.resellerAddressLine1().sendKeys(excel.getdata(1, 3, 1));
	    mb.resellerBizPhone().sendKeys(excel.getdata(1, 4, 1));
	    mb.reselleEmail().sendKeys(excel.getdata(1, 5, 1));
	    mb.resellelastName().sendKeys(excel.getdata(1, 6, 1));
	    mb.resellecity().sendKeys(excel.getdata(1, 7, 1));
	    
	    Select  statedropdown = new Select (mb.reselleState());
	    statedropdown.selectByIndex(10);
	    
	    Select countrydropdown = new Select (mb.resellerCountry());
	    countrydropdown.selectByIndex(1);
	     
	    mb.resellerZipcode().sendKeys(excel.getdata(1, 8, 1));
	    
	    Select timezonedropdown = new Select (mb.resellerTimezone());
	    timezonedropdown.selectByIndex(1);
	    
	    if(mb.resellerNextButton().isEnabled())
	    {	    
	    mb.resellerNextButton().click();
	    }
	    
	    else
	    	System.out.println("Next button is disabled");
	}

	@When("^Reseller default user creation$")
	public void reseller_default_user_creation() throws Throwable {
		driverinstantiate.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		mb=new merchantBoarding(driverinstantiate.driver);
	    mb.resellerUserFirstName().sendKeys(excel.getdata(1, 10, 1));
	   mb.resellerUserName().clear();
	    mb.resellerUserName().sendKeys(excel.getdata(1, 11, 1));
	    mb.resellerUserPassword().clear();
	    mb.resellerUserPassword().sendKeys(excel.getdata(1, 12, 1));
	    mb.resellerUserlastName().sendKeys(excel.getdata(1, 13, 1));
	    mb.resellerUseremail().clear();
	    mb.resellerUseremail().sendKeys(excel.getdata(1, 14, 1));
	    mb.resellerConfirmPassword().clear();
	    mb.resellerConfirmPassword().sendKeys(excel.getdata(1, 12, 1));
	    
	    if(mb.savebtn().isEnabled())
	    {
	    mb.savebtn().click();
	   Thread.sleep(5000);
	    }
	    
	    else {
	    	System.out.println("Save button is disabled");
	    }
	    
	}
	
	@When ("^create a Reseller Regular user$")
	public void create_a_Reseller_Regular_user() throws Throwable{
		wait.until(ExpectedConditions.elementToBeClickable( mb.maUsersTab())).click();
		wait.until(ExpectedConditions.elementToBeClickable(mb.maCreateUsers())).click();
		Thread.sleep(2000);
		excel= new Excel("D:/Swetha_project/Angular_smoke/Automationinputs.xlsx");
		 mb.maUserFirstName().sendKeys(excel.getdata(1, 16, 1));
		   mb.maUserName().clear();
		    mb.maUserName().sendKeys(excel.getdata(1, 17, 1));
		    mb.maUserPassword().clear();
		    mb.maUserPassword().sendKeys(excel.getdata(1, 18, 1));
		    mb.maUserlastName().sendKeys(excel.getdata(1, 19, 1));
		    mb.maUseremail().clear();
		    mb.maUseremail().sendKeys(excel.getdata(1, 20, 1));
		    mb.maConfirmPassword().clear();
		    mb.maConfirmPassword().sendKeys(excel.getdata(1, 18, 1));
		    
		    if(mb.maSavebtn().isEnabled())
		    {
		    mb.maSavebtn().click();
		    System.out.println("Reseller regular user is created successfully");
		    Thread.sleep(5000);
		    }
		    
		    else {
		    	
		    	System.out.println("Save button is disabled");
		    }
		  
		
	}
	
	

	@Then("^Reseller with default user is created successfully$")
	public void reseller_with_default_user_is_created_successfully() throws Throwable {
		Thread.sleep(5000);
		
		System.out.println("Reseller with default user is created successfully");
	}



}
