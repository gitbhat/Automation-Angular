package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HierarchyPicker {
	
		WebDriver driver;
		 public HierarchyPicker(WebDriver driver)
		 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 }
		 
		 @FindBy(xpath=("//a[@class='show-vt']"))
		 WebElement virtualTerminal;
		 
		 public WebElement virtualTerminal(){
			 return virtualTerminal;
		 }
		 
		 
		//select the Hierarchy picker from VT page in the drop downs 
		 @FindBy(xpath=("//i[@class='fa fa-gear']"))
		 WebElement selecthierarchy;
		 
		 public WebElement selecthierarchy(){
			 return selecthierarchy;
			 
			  }
		 
		 
		 @FindBy(xpath=("(//ul[@class='nav nav-tabs']//li//a)[1]"))
		 WebElement selectResellerTab;
		 
		 public WebElement selectResellerTab(){
			 return selectResellerTab;
		 }
			
		 @FindBy(xpath=( "//input[@name='search-reseller']"))
		 WebElement searchReseller;
		 
		 public WebElement searchReseller(){
			 return searchReseller;
		 }
	 
		 		 
		 @FindBy(xpath=( "//span[@class='badge badge-outline status ng-scope']"))
		 WebElement selectReseller;
		 
		 public WebElement selectReseller(){
			 return selectReseller;
		 }
		 
		 
		 
		//selection of Sales Agent in hierarchy picker 
		 
		 @FindBy(xpath=("(//ul[@class='nav nav-tabs']//li//a)[2]"))
		 WebElement selectSalesAgentTab;
		 
		 public WebElement selectSalesAgentTab(){
			 return selectSalesAgentTab;
		 }
		 
			
		 @FindBy(xpath=( "//input[@name='search-sales-agent']"))
		 WebElement searchSalesAgent;
		 
		 public WebElement searchSalesAgent(){
			 return searchSalesAgent;
		 }
		 
		 @FindBy(xpath=( "//span[@class='badge badge-outline status ng-scope']"))
		 WebElement selectSalesAgent;
		 
		 public WebElement selectSalesAgent(){
			 return selectSalesAgent;
		 }
		 
		 
		//selection of Merchant Group in hierarchy picker 
		 
		 @FindBy(xpath=("(//ul[@class='nav nav-tabs']//li//a)[3]"))
		 WebElement selectMerchantGroupTab;
		 
		 public WebElement selectMerchantGroupTab(){
			 return selectMerchantGroupTab;
		 }
		 
			
		 @FindBy(xpath=( "//input[@name='search-mg']"))
		 WebElement searchMerchantGroup;
		 
		 public WebElement searchMerchantGroup(){
			 return searchMerchantGroup;
		 }
		 
		 @FindBy(xpath=( "//span[@class='badge badge-outline status ng-scope']"))
		 WebElement selectMerchantGroup;
		 
		 public WebElement selectMerchantGroup(){
			 return selectMerchantGroup;
		 }
		 
		 
		 //selection of Merchant Account in hierarchy picker 
		 
		 @FindBy(xpath=("(//ul[@class='nav nav-tabs']//li//a)[4]"))
		 WebElement selectMerchantAccountTab;
		 
		 public WebElement selectMerchantAccountTab(){
			 return selectMerchantAccountTab;
		 }
		 
			
		 @FindBy(xpath=( "//input[@name='search-ma']"))
		 WebElement searchMerchantAccount;
		 
		 public WebElement searchMerchantAccount(){
			 return searchMerchantAccount;
		 }
		 
		 @FindBy(xpath=( "//span[@class='badge badge-outline status ng-scope']"))
		 WebElement selectMerchantAccount;
		 
		 public WebElement selectMerchantAccount(){
			 return selectMerchantAccount;
		 }
		 
		 
		 
		 
		 
}
