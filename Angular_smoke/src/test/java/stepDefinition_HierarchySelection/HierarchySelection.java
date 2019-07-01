package stepDefinition_HierarchySelection;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Excel;
import pageObjects.HierarchyPicker;
import pageObjects.login;
import pageObjects.merchantBoarding;
import stepDefinition_Login.driverinstantiate;

public class HierarchySelection extends driverinstantiate {
	
	//public static WebDriver driver;
	Properties p=new Properties();
	Excel excel;
	login login;
	HierarchyPicker hp;
	
	WebDriver driver= getDriver();
	WebDriverWait wait= new WebDriverWait(driverinstantiate.driver, 50);
	@Given("user has clicked on hierarchy picker")
	public void user_has_clicked_on_hierarchy_picker() throws Throwable {
	  hp= new HierarchyPicker(driverinstantiate.driver);
	  excel=new Excel("D:/Swetha_project/Angular_smoke/Automationinputs.xlsx");
	  driver.navigate().refresh();
	  wait.until(ExpectedConditions.elementToBeClickable(hp.selecthierarchy())).click();
	//  wait.until(ExpectedConditions.elementToBeClickable(hp.selectReseller())).click();
	//  wait.until(ExpectedConditions.visibilityOf(hp.searchReseller())).sendKeys(excel.getdata(0,17,1));
	}

	@When("select the Reseller")
	public void select_the_Reseller() throws Throwable {
		 wait.until(ExpectedConditions.elementToBeClickable(hp.selectResellerTab())).click();
		 wait.until(ExpectedConditions.visibilityOf(hp.searchReseller())).click();
		wait.until(ExpectedConditions.visibilityOf(hp.searchReseller())).sendKeys(excel.getdata(0,17,1));
		wait.until(ExpectedConditions.elementToBeClickable(hp.selectReseller())).click();
	}

	@When("select the Sales Agent")
	public void select_the_Sales_Agent() throws Throwable {
		 wait.until(ExpectedConditions.elementToBeClickable(hp.selectSalesAgentTab())).click();
		 wait.until(ExpectedConditions.visibilityOf(hp.searchSalesAgent())).click();
		wait.until(ExpectedConditions.visibilityOf(hp.searchSalesAgent())).sendKeys(excel.getdata(0,18,1));
		wait.until(ExpectedConditions.elementToBeClickable(hp.selectSalesAgent())).click();
	}

	@When("select the Merchant Group")
	public void select_the_Merchant_Group() throws Throwable {
		 wait.until(ExpectedConditions.elementToBeClickable(hp.selectMerchantGroupTab())).click();
		 wait.until(ExpectedConditions.visibilityOf(hp.searchMerchantGroup())).click();
		wait.until(ExpectedConditions.visibilityOf(hp.searchMerchantGroup())).sendKeys(excel.getdata(0,19,1));
		wait.until(ExpectedConditions.elementToBeClickable(hp.selectMerchantGroup())).click();
	}

	@When("select the desired Merchant Account")
	public void select_the_Merchant_Account() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(hp.selectMerchantAccountTab())).click();
		 wait.until(ExpectedConditions.visibilityOf(hp.searchMerchantAccount())).click();
		wait.until(ExpectedConditions.visibilityOf(hp.searchMerchantAccount())).sendKeys(excel.getdata(0,20,1));
		wait.until(ExpectedConditions.elementToBeClickable(hp.selectMerchantAccount())).click();
		 wait.until(ExpectedConditions.elementToBeClickable(hp.selecthierarchy())).click();
	}

	@Then("Display the hierarchy selected")
	public void display_the_hierarchy_selected() {
	    System.out.println("Hierarchy selected successfully");
	}


}