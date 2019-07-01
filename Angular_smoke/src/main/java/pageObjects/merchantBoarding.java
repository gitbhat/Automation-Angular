package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class merchantBoarding {
	WebDriver driver;
	 public merchantBoarding(WebDriver driver)
	 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath=("//a[@href='#/merchantboarding']"))
	 WebElement merchantboarding;
	 
	 public WebElement merchantboarding(){
		 return merchantboarding;
	 }
	 
	 
	 
	 @FindBy(xpath=("//button[@class='btn btn-raised btn-danger text-sm float-right mt-0 mb-5 p-10']"))
	 WebElement createReseller;
	 
	 public WebElement createReseller(){
		 return createReseller;
	 }
	 
	 
	 @FindBy(xpath=("//*[@id='businessName']"))
	 WebElement resellerBusinessName;
	 
	 public WebElement resellerBusinessName(){
		 return resellerBusinessName;
	 }
	 
	 @FindBy(xpath=("//*[@name='firstName']"))
	 WebElement resellerfirstName;
	 
	 public WebElement resellerfirstName(){
		 return resellerfirstName;
	 }
	 
	 @FindBy(xpath=("//*[@name='addressLine1']"))
	 WebElement resellerAddressLine1;
	 
	 public WebElement resellerAddressLine1(){
		 return resellerAddressLine1;
	 }
	 
	 @FindBy(xpath=("//*[@name='bizPhone']"))
	 WebElement resellerBizPhone;
	 
	 public WebElement resellerBizPhone(){
		 return resellerBizPhone;
	 }
	 
	 @FindBy(xpath=("//*[@name='email']"))
	 WebElement reselleEmail;
	 
	 public WebElement reselleEmail(){
		 return reselleEmail;
	 }
	 
	 @FindBy(xpath=("//*[@name='lastName']"))
	 WebElement resellelastName;
	 
	 public WebElement resellelastName(){
		 return resellelastName;
	 }
	 
	 @FindBy(xpath=("//*[@name='city']"))
	 WebElement resellecity;
	 
	 public WebElement resellecity(){
		 return resellecity;
	 }
	 
	 @FindBy(xpath=("//*[@name='state']"))
	 WebElement reselleState;
	 
	 public WebElement reselleState(){
		 return reselleState;
	 }
	 
	 @FindBy(xpath=("//*[@id='country']"))
	 WebElement resellerCountry;
	 
	 public WebElement resellerCountry(){
		 return resellerCountry;
	 }
	 
	 @FindBy(xpath=("//*[@name='zipcode']"))
	 WebElement resellerZipcode;
	 
	 public WebElement resellerZipcode(){
		 return resellerZipcode;
	 }
	 
	 @FindBy(xpath=("//*[@name='timezone']"))
	 WebElement resellerTimezone;
	 
	 public WebElement resellerTimezone(){
		 return resellerTimezone;
	 }
	 
	 @FindBy(xpath=("//button[@class='btn btn-raised btn-green text-sm col-md-2 mt-20 float-right mr-20 ng-scope']"))
	 WebElement resellerNextButton;
	 
	 public WebElement resellerNextButton(){
		 return resellerNextButton;
	 }
	 
	 @FindBy(xpath=("//*[@name='userDeffirstName']"))
	 WebElement resellerUserFirstName;
	 
	 public WebElement resellerUserFirstName(){
		 return resellerUserFirstName;
	 }
	 
	 @FindBy(xpath=("//*[@name='userDefuserName']"))
	 WebElement resellerUserName;
	 
	 public WebElement resellerUserName(){
		 return resellerUserName;
	 }
	 
	 @FindBy(xpath=("//*[@name='userDefpassword']"))
	 WebElement resellerUserPassword;
	 
	 public WebElement resellerUserPassword(){
		 return resellerUserPassword;
	 }
	 
	 @FindBy(xpath=("//*[@name='userDeflastName']"))
	 WebElement resellerUserlastName;
	 
	 public WebElement resellerUserlastName(){
		 return resellerUserlastName;
	 }
	 
	 @FindBy(xpath=("//*[@name='userDefemail']"))
	 WebElement resellerUseremail;
	 
	 public WebElement resellerUseremail(){
		 return resellerUseremail;
	 }
	 
	 @FindBy(xpath=("//*[@name='userDef-confirmPassword']"))
	 WebElement resellerConfirmPassword;
	 
	 public WebElement resellerConfirmPassword(){
		 return resellerConfirmPassword;
	 }
	 
	 
	 
	 @FindBy(xpath=("//*[@id='save-btn']"))
	 WebElement savebtn;
	 
	 public WebElement savebtn(){
		 return savebtn;
		 
	 }
		 
	
	 //============Sales Agent page objects======================//
		 @FindBy(xpath=("//a[contains(@id,'sales-agent-tab') and normalize-space(.)='Sales Agent']"))
		 WebElement saTab;
		 
		 public WebElement saTab(){
			 return saTab;
		 }
		 
		  
		 @FindBy(xpath=("//button[@class='btn btn-raised btn-danger btn-sm text-sm mt-5 mb-5 p-10 ng-binding ng-scope']"))
		 WebElement saCreate;
		 
		  public WebElement saCreate(){
			 return saCreate;
		 }
		 
		  
		 @FindBy(xpath=("//*[@id='businessName']"))
		 WebElement sabusinessName;
		 
		 public WebElement sabusinessName(){
			 return sabusinessName;
		 }
		  
			 
		 @FindBy(xpath=("//*[@name='firstName']"))
		 WebElement safirstName;
		 
		 public WebElement safirstName(){
			 return safirstName;
		 } 
		 
		 @FindBy(xpath=("//*[@name='addressLine1']"))
		 WebElement saAdd1;
		 
		 public WebElement saAdd1(){
			 return saAdd1;
		 } 
		 
		 @FindBy(xpath=("//*[@name='bizPhone']"))
		 WebElement saBizPhone1;
		 
		 public WebElement saBizPhone1(){
			 return saBizPhone1;
		 } 
		 
		 @FindBy(xpath=("//*[@name='email']"))
		 WebElement saEmail;
		 
		 public WebElement saEmail(){
			 return saEmail;
		 } 
		 
		 @FindBy(xpath=("//*[@name='lastName']"))
		 WebElement saLastName;
		 
		 public WebElement saLastName(){
			 return saLastName;
		 } 
		 
		 @FindBy(xpath=("//*[@name='city']"))
		 WebElement saCity;
		 
		 public WebElement saCity(){
			 return saCity;
		 } 
		 
		 @FindBy(xpath=("//*[@id='state']"))
		 WebElement saState;
		 
		 public WebElement saState(){
			 return saState;
		 } 
		 
		 
		 @FindBy(xpath=("//*[@id='country']"))
		 WebElement saCountry;
		 
		 public WebElement saCountry(){
			 return saCountry;
		 } 
		 
		 @FindBy(xpath=("//*[@name='zipcode']"))
		 WebElement saZipcode;
		 
		 public WebElement saZipcode(){
			 return saZipcode;
		 } 
		 
		 @FindBy(xpath=("//*[@id='timezone']"))
		 WebElement saTimezone;
		 
		 public WebElement saTimezone(){
			 return saTimezone;
		 } 
		 
				 
		 @FindBy(xpath=("//button[@class='btn btn-raised btn-green text-sm col-md-2 mt-20 float-right mr-20 ng-scope']"))
		 WebElement saNext;
		 
		 public WebElement saNext(){
			 return saNext;
		 } 
		 
		// Default SA user creation:
		 
		 @FindBy(xpath=("//*[@name='userDeffirstName']"))
		 WebElement saUserFirstName;
		 
		 public WebElement saUserFirstName(){
			 return saUserFirstName;
		 }
		 
		 @FindBy(xpath=("//*[@name='userDefuserName']"))
		 WebElement saUserName;
		 
		 public WebElement saUserName(){
			 return saUserName;
		 }
		 
		 @FindBy(xpath=("//*[@name='userDefpassword']"))
		 WebElement saUserPassword;
		 
		 public WebElement saUserPassword(){
			 return saUserPassword;
		 }
		 
		 @FindBy(xpath=("//*[@name='userDeflastName']"))
		 WebElement saUserlastName;
		 
		 public WebElement saUserlastName(){
			 return saUserlastName;
		 }
		 
		 @FindBy(xpath=("//*[@name='userDefemail']"))
		 WebElement saUseremail;
		 
		 public WebElement saUseremail(){
			 return saUseremail ;
		 }
		 
		 @FindBy(xpath=("//*[@name='userDef-confirmPassword']"))
		 WebElement saUserConfirmPassword;
		 
		 public WebElement saUserConfirmPassword(){
			 return saUserConfirmPassword;
		 }
		 
		 
		 
		 @FindBy(xpath=("//*[@id='save-btn']"))
		 WebElement sasavebtn;
		 
		 public WebElement sasavebtn(){
			 return sasavebtn;
			 
		 }
		 
		 
		 
		//============Merchant Group page objects======================//
		 //@FindBy(xpath=("//a[@id='merchant-group-tab']"))
		 
		 @FindBy(xpath=("//a[contains(@id,'merchant-group-tab') and normalize-space(.)='Merchant Group']"))
		 WebElement mgTab;
		 
		 public WebElement mgTab (){
			 return mgTab;
		 }
		 
		  
		 @FindBy(xpath=("//button[@class='btn btn-raised btn-danger btn-sm text-sm mt-5 mb-5 p-10 ng-binding ng-scope']"))
		 WebElement mgCreate;
		 
		  public WebElement mgCreate(){
			 return mgCreate;
		 }
		 
		  
		 @FindBy(xpath=("//*[@id='businessName']"))
		 WebElement mgbusinessName;
		 
		 public WebElement mgbusinessName(){
			 return mgbusinessName;
		 }
		  
			 
		 @FindBy(xpath=("//*[@name='firstName']"))
		 WebElement mgfirstName;
		 
		 public WebElement mgfirstName(){
			 return mgfirstName;
		 } 
		 
		 @FindBy(xpath=("//*[@name='addressLine1']"))
		 WebElement mgAdd1;
		 
		 public WebElement mgAdd1(){
			 return mgAdd1;
		 } 
		 
		 @FindBy(xpath=("//*[@name='bizPhone']"))
		 WebElement mgBizPhone1;
		 
		 public WebElement mgBizPhone1(){
			 return mgBizPhone1;
		 } 
		 
		 @FindBy(xpath=("//*[@name='email']"))
		 WebElement mgEmail;
		 
		 public WebElement mgEmail(){
			 return mgEmail;
		 } 
		 
		 @FindBy(xpath=("//*[@name='lastName']"))
		 WebElement mgLastName;
		 
		 public WebElement mgLastName(){
			 return mgLastName;
		 } 
		 
		 @FindBy(xpath=("//*[@name='city']"))
		 WebElement mgCity;
		 
		 public WebElement mgCity(){
			 return mgCity;
		 } 
		 
		 @FindBy(xpath=("//*[@id='state']"))
		 WebElement mgState;
		 
		 public WebElement mgState(){
			 return mgState;
		 } 
		 
		 
		 @FindBy(xpath=("//*[@id='country']"))
		 WebElement mgCountry;
		 
		 public WebElement mgCountry(){
			 return mgCountry;
		 } 
		 
		 @FindBy(xpath=("//*[@name='zipcode']"))
		 WebElement mgZipcode;
		 
		 public WebElement mgZipcode(){
			 return mgZipcode;
		 } 
		 
		 @FindBy(xpath=("//*[@id='timezone']"))
		 WebElement mgTimezone;
		 
		 public WebElement mgTimezone(){
			 return mgTimezone;
		 } 
		 
				 
		 @FindBy(xpath=("//button[@class='btn btn-raised btn-green text-sm col-md-2 mt-20 float-right mr-20 ng-scope']"))
		 WebElement mgNext;
		 
		 public WebElement mgNext(){
			 return mgNext;
		 } 
		 
		// Default MG user creation:
		 
		 @FindBy(xpath=("//*[@name='userDeffirstName']"))
		 WebElement mgUserFirstName;
		 
		 public WebElement mgUserFirstName(){
			 return mgUserFirstName;
		 }
		 
		 @FindBy(xpath=("//*[@name='userDefuserName']"))
		 WebElement mgUserName;
		 
		 public WebElement mgUserName(){
			 return mgUserName;
		 }
		 
		 @FindBy(xpath=("//*[@name='userDefpassword']"))
		 WebElement mgUserPassword;
		 
		 public WebElement mgUserPassword(){
			 return mgUserPassword;
		 }
		 
		 @FindBy(xpath=("//*[@name='userDeflastName']"))
		 WebElement mgUserlastName;
		 
		 public WebElement mgUserlastName(){
			 return mgUserlastName;
		 }
		 
		 @FindBy(xpath=("//*[@name='userDefemail']"))
		 WebElement mgUseremail;
		 
		 public WebElement mgUseremail(){
			 return mgUseremail ;
		 }
		 
		 @FindBy(xpath=("//*[@name='userDef-confirmPassword']"))
		 WebElement mgConfirmPassword;
		 
		 public WebElement mgConfirmPassword(){
			 return mgConfirmPassword;
		 }
		 
		 
		 
		 @FindBy(xpath=("//*[@id='save-btn']"))
		 WebElement mgSavebtn;
		 
		 public WebElement mgSavebtn(){
			 return mgSavebtn;
			 
		 }
			 
		//============Merchant Account page objects======================//
		 @FindBy(xpath=("//*[@id='merchant-account-tab']"))
		 WebElement maTab;
		 
		 public WebElement maTab (){
			 return maTab;
		 }
		 
		  
		 @FindBy(xpath=("//button[@class='btn btn-raised btn-danger btn-sm text-sm mt-5 mb-5 p-10 ng-binding ng-scope']"))
		 WebElement maCreate;
		 
		  public WebElement maCreate(){
			 return maCreate;
		 }
		 
		  
		 @FindBy(xpath=("//*[@id='businessName']"))
		 WebElement mabusinessName;
		 
		 public WebElement mabusinessName(){
			 return mabusinessName;
		 }
		  
			 
		 @FindBy(xpath=("//*[@name='firstName']"))
		 WebElement mafirstName;
		 
		 public WebElement mafirstName(){
			 return mafirstName;
		 } 
		 
		 @FindBy(xpath=("//*[@name='addressLine1']"))
		 WebElement maAdd1;
		 
		 public WebElement maAdd1(){
			 return maAdd1;
		 } 
		 
		 @FindBy(xpath=("//*[@name='bizPhone']"))
		 WebElement maBizPhone1;
		 
		 public WebElement maBizPhone1(){
			 return maBizPhone1;
		 } 
		 
		 @FindBy(xpath=("//*[@name='email']"))
		 WebElement maEmail;
		 
		 public WebElement maEmail(){
			 return maEmail;
		 } 
		 
		 @FindBy(xpath=("//*[@name='lastName']"))
		 WebElement maLastName;
		 
		 public WebElement maLastName(){
			 return maLastName;
		 } 
		 
		 @FindBy(xpath=("//*[@name='city']"))
		 WebElement maCity;
		 
		 public WebElement maCity(){
			 return maCity;
		 } 
		 
		 @FindBy(xpath=("//*[@id='state']"))
		 WebElement maState;
		 
		 public WebElement maState(){
			 return maState;
		 } 
		 
		 
		 @FindBy(xpath=("//*[@id='country']"))
		 WebElement maCountry;
		 
		 public WebElement maCountry(){
			 return maCountry;
		 } 
		 
		 @FindBy(xpath=("//*[@name='zipcode']"))
		 WebElement maZipcode;
		 
		 public WebElement maZipcode(){
			 return maZipcode;
		 } 
		 
		 @FindBy(xpath=("//*[@id='timezone']"))
		 WebElement maTimezone;
		 
		 public WebElement maTimezone(){
			 return maTimezone;
		 } 
		 
				 
		 @FindBy(xpath=("//button[@class='btn btn-raised btn-green text-sm col-md-2 mt-20 float-right mr-20 ng-scope']"))
		 WebElement maNext;
		 
		 public WebElement maNext(){
			 return maNext;
		 } 
		 
		// Default and Regular MA user creation:
		 
		 @FindBy(xpath=("//*[@name='userDeffirstName']"))
		 WebElement maUserFirstName;
		 
		 public WebElement maUserFirstName(){
			 return maUserFirstName;
		 }
		 
		 @FindBy(xpath=("//*[@name='userDefuserName']"))
		 WebElement maUserName;
		 
		 public WebElement maUserName(){
			 return maUserName;
		 }
		 
		 @FindBy(xpath=("//*[@name='userDefpassword']"))
		 WebElement maUserPassword;
		 
		 public WebElement maUserPassword(){
			 return maUserPassword;
		 }
		 
		 @FindBy(xpath=("//*[@name='userDeflastName']"))
		 WebElement maUserlastName;
		 
		 public WebElement maUserlastName(){
			 return maUserlastName;
		 }
		 
		 @FindBy(xpath=("//*[@name='userDefemail']"))
		 WebElement maUseremail;
		 
		 public WebElement maUseremail(){
			 return maUseremail ;
		 }
		 
		 @FindBy(xpath=("//*[@name='userDef-confirmPassword']"))
		 WebElement maConfirmPassword;
		 
		 public WebElement maConfirmPassword(){
			 return maConfirmPassword;
		 }
		 
		 
		 
		 @FindBy(xpath=("//*[@id='save-btn']"))
		 WebElement maSavebtn;
		 
		 public WebElement maSavebtn(){
			 return maSavebtn;
			 
		 }
		 
		 //Merchant Account Regular User creation
		 
		 @FindBy(xpath=("//*[@id='merchant-account-users']"))
		 WebElement maUsersTab;
		 
		 public WebElement maUsersTab(){
			 return maUsersTab;
			 
		 }
		 
		 @FindBy(xpath=("//*[@class='btn btn-raised btn-danger btn-sm text-sm mt-5 mb-5 p-10 ng-binding ng-scope']"))
		 WebElement maCreateUsers;
		 
		 public WebElement maCreateUsers(){
			 return maCreateUsers;
			 
		 }
		 
		 // click on close button
		 @FindBy(xpath=("//*[@class='btn btn-raised btn-default text-sm col-md-5 mt-20 col-md-offset-1 float-right']"))
		 WebElement closebtn;
		 
		 public WebElement closebtn(){
			 return closebtn;
			 
		 }
		 
		 
		 //********* Merchant Account configuration*********
		 
		 
			 
		 @FindBy(xpath=("(//*[@id='merchant-account-tab'])[1]"))
		 WebElement gateWayConfig;
		 
		 public WebElement gateWayConfig(){
			 return gateWayConfig;
			 
		 }

		
		 @FindBy(xpath=("(//*[@id='merchant-account-processors'])"))
		 WebElement processors;
		 
		 public WebElement processors(){
			 return processors;
			 
		 }
		 
		 @FindBy(xpath=("//button[@class='btn btn-raised btn-default text-sm mt-5 mb-5 p-10']"))
		 WebElement createProcessor;
		 
		 public WebElement createProcessor(){
			 return createProcessor;
		 } 
		 
		 @FindBy(xpath=("(//*[@id='paymentMethod'])"))
		 WebElement processorType;
		 
		 public WebElement processorType(){
			 return processorType;
			 
		 }
		 
		 @FindBy(xpath=("(//*[@id='selectedProcessor'])"))
		 WebElement processorSelect;
		 
		 public WebElement processorSelect(){
			 return processorSelect;
			 
		 }

		 @FindBy(xpath=("//button[@id='save-btn']"))
		 WebElement saveProcessor;
		 
		 public WebElement saveProcessor(){
			 return saveProcessor;
		 } 
			 
		 
		 @FindBy(xpath=("//a[contains(@id,'merchant-account-tab') and normalize-space(.)='Processing Applications']"))
		 WebElement processingApplication;
		 
		 public WebElement processingApplication(){
			 return processingApplication;
			 
		 }
		 
		 @FindBy(xpath=("//label[@for='14']"))
		 WebElement enableVT;
		 
		 public WebElement enableVT(){
			 return enableVT;
			 
		 }
		 
		 
		 
		 //************** select and edit in MB
		 
		 @FindBy(xpath=("//table[@class='table table-hover summary-table']//tbody/tr[1]/td[3]/button[1]"))
		 WebElement editMG;
		 
		 public WebElement editMG(){
			 return editMG;
			 
		 }
		 
		 
		 @FindBy(xpath=("//table[@class='table table-hover summary-table']//tbody/tr[1]/td[3]/button[1]"))
		 WebElement editMA;
		 
		 public WebElement editMA(){
			 return editMA;
			 
		 }
		
		 
		 @FindBy(xpath=("(//div[@class='form-group col-md-1 mt-0'])[3]"))
		 WebElement selectVT;
		 
		 public WebElement selectVT(){
			 return selectVT;
			 
		 }



}
