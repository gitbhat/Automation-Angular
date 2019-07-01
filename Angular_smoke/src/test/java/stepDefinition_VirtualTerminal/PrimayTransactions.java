package stepDefinition_VirtualTerminal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.Excel;
import pageObjects.VirtualTerminal;
import pageObjects.login;
import pageObjects.merchantBoarding;
import stepDefinition_Login.driverinstantiate;
import stepDefinition_Login.steps_login;


public class PrimayTransactions extends driverinstantiate {
	Excel excel;
	login login;
	VirtualTerminal vt;
	public static String TransactionId;
	public static WebDriverWait d;
	
	WebDriver driver= getDriver();
	WebDriverWait wait= new WebDriverWait(driverinstantiate.driver, 60);
	
	@Given("^Login to Application$")
	public void login_to_Application() throws Throwable {
		excel=new Excel("D:/Swetha_project/Angular_smoke/Automationinputs.xlsx");
		driver.get(excel.getdata(0, 1, 1));
    	Thread.sleep(2000);
    	login = new login(driver);
    	login.Usern().sendKeys(excel.getdata(0, 11, 1));
    	login.Pass().sendKeys(excel.getdata(0, 12, 1));
    	login.btn().click();
    	Thread.sleep(8000);
    	
	}

	@When("^Click on VT$")
	public void click_on_VT() {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		driver.navigate().refresh();
	    vt=new VirtualTerminal(driver);
	    vt.virtualTerminal().click();
	    
	    
	}

	@When("^select Credit sale and perform the transcation$")
	public void select_Credit_sale_and_perform_the_transcation() throws Throwable {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		vt=new VirtualTerminal(driver);
		 vt.selectPaymentMethod().click();
		 wait.until(ExpectedConditions.visibilityOf( vt.selectCreditCard())).click();
		 wait.until(ExpectedConditions.visibilityOf( vt.selectTransactionType())).click();
		 wait.until(ExpectedConditions.visibilityOf(vt.selectSale())).click();
		 vt.amount().clear();
		 wait.until(ExpectedConditions.visibilityOf(vt.amount())) .sendKeys(excel.getdata(2, 1, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.taxAmount())).sendKeys(excel.getdata(2, 2, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.cardNumber())).sendKeys(excel.getdata(2, 3, 1));
		 wait.until(ExpectedConditions.visibilityOf( vt.expMonth())).sendKeys(excel.getdata(2, 4, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.expYear())).sendKeys(excel.getdata(2, 5, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.cvv())).sendKeys(excel.getdata(2, 6, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.accountHolder())).sendKeys(excel.getdata(2, 7, 1));
		 wait.until(ExpectedConditions.elementToBeClickable(vt.processBtn())).click();
		 Thread.sleep(6000);
		 
		 
		 if(vt.transactionReceipt().isDisplayed()){
			 steps_login.TransactionType =wait.until(ExpectedConditions.visibilityOf(vt.selectTransactionType())).getText();
			 steps_login.TransactionId = vt.transactionId().getText();
				System.out.println("The transcation Type and id for CREDIT SALE displayed on receipt is "+steps_login.TransactionType +"  , "+steps_login.TransactionId);
				
				
					
		 wait.until(ExpectedConditions.elementToBeClickable(vt.receiptClose())).click();
		 }
		 
		 else {
			 System.out.println("Unable to process Transactions");
			 
		 }
		 
		 
	}

	@When("^select Credit Auth and perform the transcation$")
	public void select_Credit_Auth_and_perform_the_transcation() throws Throwable {
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		//vt=new VirtualTerminal(driver);
		// vt.selectPaymentMethod().click();
		 //vt.selectCreditCard().click();
		Thread.sleep(3000);;
		 wait.until(ExpectedConditions.elementToBeClickable(vt.selectTransactionType())).click();
		 wait.until(ExpectedConditions.visibilityOf(vt.selectAuth())).click();
		 vt.amount().clear();
		 wait.until(ExpectedConditions.visibilityOf(vt.amount())) .sendKeys(excel.getdata(2, 1, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.taxAmount())).sendKeys(excel.getdata(2, 2, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.cardNumber())).sendKeys(excel.getdata(2, 3, 1));
		 wait.until(ExpectedConditions.visibilityOf( vt.expMonth())).sendKeys(excel.getdata(2, 4, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.expYear())).sendKeys(excel.getdata(2, 5, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.cvv())).sendKeys(excel.getdata(2, 6, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.accountHolder())).sendKeys(excel.getdata(2, 7, 1));
		 wait.until(ExpectedConditions.elementToBeClickable(vt.processBtn())).click();
		 
		 if(vt.transactionReceipt().isDisplayed()){
			 steps_login.TransactionType =wait.until(ExpectedConditions.visibilityOf(vt.selectTransactionType())).getText();
			 steps_login.TransactionId = vt.transactionId().getText();
				System.out.println("The transcation Type and id for CREDIT AUTH displayed on receipt is "+steps_login.TransactionType +"  , "+steps_login.TransactionId);
				
				
					
		 wait.until(ExpectedConditions.elementToBeClickable(vt.receiptClose())).click();
		 }
		 
		 else {
			 System.out.println("Unable to process Transactions");
			 
		 }
	}

	@When("^select Credit Refund and perform the transcation$")
	public void select_Credit_Refund_and_perform_the_transcation() throws Throwable {
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		//vt=new VirtualTerminal(driver);
		// vt.selectPaymentMethod().click();
		 //vt.selectCreditCard().click();
		Thread.sleep(3000);
		 wait.until(ExpectedConditions.visibilityOf( vt.selectTransactionType())).click();
		 wait.until(ExpectedConditions.visibilityOf(vt.selectRefund())).click();
		 vt.amount().clear();
		 wait.until(ExpectedConditions.visibilityOf(vt.amount())) .sendKeys(excel.getdata(2, 1, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.taxAmount())).sendKeys(excel.getdata(2, 2, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.cardNumber())).sendKeys(excel.getdata(2, 3, 1));
		 wait.until(ExpectedConditions.visibilityOf( vt.expMonth())).sendKeys(excel.getdata(2, 4, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.expYear())).sendKeys(excel.getdata(2, 5, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.cvv())).sendKeys(excel.getdata(2, 6, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.accountHolder())).sendKeys(excel.getdata(2, 7, 1));
		 wait.until(ExpectedConditions.elementToBeClickable(vt.processBtn())).click();
		 
		 if(vt.transactionReceipt().isDisplayed()){
			 steps_login.TransactionType =wait.until(ExpectedConditions.visibilityOf(vt.selectTransactionType())).getText();
			 steps_login.TransactionId = vt.transactionId().getText();
				System.out.println("The transcation Type and id for CREDIT REFUND displayed on receipt is "+steps_login.TransactionType +"  , "+steps_login.TransactionId);
				
				
			Thread.sleep(2000);		
		 wait.until(ExpectedConditions.elementToBeClickable(vt.receiptClose())).click();
		 }
		 
		 else {
			 System.out.println("Unable to process Transactions");
			 
		 }
	}

	@When("select ACH sale and perform the transcation")
	public void select_ACH_sale_and_perform_the_transcation() throws Throwable {
	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		//vt=new VirtualTerminal(driver);
		Thread.sleep(3000);
		vt.selectPaymentMethod().click();
		Thread.sleep(3000);
		 vt.selectACH().click();
		 wait.until(ExpectedConditions.visibilityOf( vt.selectTransactionType())).click();
		 wait.until(ExpectedConditions.visibilityOf(vt.selectSale())).click();
		 vt.amount().clear();
		 wait.until(ExpectedConditions.visibilityOf(vt.amount())) .sendKeys(excel.getdata(2, 1, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.taxAmount())).sendKeys(excel.getdata(2, 2, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.accountNumber())).sendKeys(excel.getdata(2, 9, 1));
		 wait.until(ExpectedConditions.visibilityOf( vt.routingNumber())).sendKeys(excel.getdata(2, 10, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.nameOnCheck())).sendKeys(excel.getdata(2, 11, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.checking())).click();
		// wait.until(ExpectedConditions.visibilityOf(vt.accountHolder())).sendKeys(excel.getdata(2, 7, 1));
		 wait.until(ExpectedConditions.elementToBeClickable(vt.processBtn())).click();
		 
		 if(vt.transactionReceipt().isDisplayed()){
			 steps_login.TransactionType =wait.until(ExpectedConditions.visibilityOf(vt.selectTransactionType())).getText();
			 steps_login.TransactionId = vt.transactionId().getText();
				System.out.println("The transcation Type and id for ACH SALE displayed on receipt is "+steps_login.TransactionType +"  , "+steps_login.TransactionId);
				
				
					
		 wait.until(ExpectedConditions.elementToBeClickable(vt.receiptClose())).click();
		 }
		 
		 else {
			 System.out.println("Unable to process Transactions");
			 
		 }
	}

	@When("select Check Sale and perform the transcation")
	public void select_Check_Sale_and_perform_the_transcation() throws Throwable  {
		Thread.sleep(3000);
		vt.selectPaymentMethod().click();
		Thread.sleep(3000);
		 vt.selectCheck().click();
		 wait.until(ExpectedConditions.visibilityOf( vt.selectTransactionType())).click();
		 wait.until(ExpectedConditions.visibilityOf(vt.selectSale())).click();
		 vt.amount().clear();
		 wait.until(ExpectedConditions.visibilityOf(vt.amount())) .sendKeys(excel.getdata(2, 1, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.taxAmount())).sendKeys(excel.getdata(2, 2, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.accountNumber())).sendKeys(excel.getdata(2, 9, 1));
		 wait.until(ExpectedConditions.visibilityOf( vt.routingNumber())).sendKeys(excel.getdata(2, 10, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.nameOnCheck())).sendKeys(excel.getdata(2, 11, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.checking())).click();
		// wait.until(ExpectedConditions.visibilityOf(vt.accountHolder())).sendKeys(excel.getdata(2, 7, 1));
		 wait.until(ExpectedConditions.elementToBeClickable(vt.processBtn())).click();
		 
		 if(vt.transactionReceipt().isDisplayed()){
			 steps_login.TransactionType =wait.until(ExpectedConditions.visibilityOf(vt.selectTransactionType())).getText();
			 steps_login.TransactionId = vt.transactionId().getText();
				System.out.println("The transcation Type and id for CHECK SALE displayed on receipt is "+steps_login.TransactionType +"  , "+steps_login.TransactionId);
				
				
					
		 wait.until(ExpectedConditions.elementToBeClickable(vt.receiptClose())).click();
		 }
		 
		 else {
			 System.out.println("Unable to process Transactions");
			 
		 }
	}

	@When("select Check Refund and perform the transcation")
	public void select_Check_Refund_and_perform_the_transcation() throws Throwable {
		Thread.sleep(3000);
		 wait.until(ExpectedConditions.visibilityOf( vt.selectPaymentMethod())).click();
		Thread.sleep(3000);
		 vt.selectCheck().click();
		 wait.until(ExpectedConditions.visibilityOf( vt.selectTransactionType())).click();
		 wait.until(ExpectedConditions.visibilityOf(vt.selectSale())).click();
		 vt.amount().clear();
		 wait.until(ExpectedConditions.visibilityOf(vt.amount())) .sendKeys(excel.getdata(2, 1, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.taxAmount())).sendKeys(excel.getdata(2, 2, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.accountNumber())).sendKeys(excel.getdata(2, 9, 1));
		 wait.until(ExpectedConditions.visibilityOf( vt.routingNumber())).sendKeys(excel.getdata(2, 10, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.nameOnCheck())).sendKeys(excel.getdata(2, 11, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.checking())).click();
		// wait.until(ExpectedConditions.visibilityOf(vt.accountHolder())).sendKeys(excel.getdata(2, 7, 1));
		 wait.until(ExpectedConditions.elementToBeClickable(vt.processBtn())).click();
		 
		 if(vt.transactionReceipt().isDisplayed()){
			 steps_login.TransactionType =wait.until(ExpectedConditions.visibilityOf(vt.selectTransactionType())).getText();
			 steps_login.TransactionId = vt.transactionId().getText();
				System.out.println("The transcation Type and id for CHECK REFUND displayed on receipt is "+steps_login.TransactionType +"  , "+steps_login.TransactionId);
			Thread.sleep(2000);						
		 wait.until(ExpectedConditions.elementToBeClickable(vt.receiptClose())).click();
		 }
		 
		 else {
			 System.out.println("Unable to process Transactions");
			 
		 }
	}

	@When("^select Check21 sale and perform the transcation$")
	public void select_Check21_Sale_and_perform_the_transcation() throws Throwable {
		Thread.sleep(3000);
		vt.selectPaymentMethod().click();
		Thread.sleep(3000);
		 vt.selectCheck21().click();
		 wait.until(ExpectedConditions.visibilityOf( vt.selectTransactionType())).click();
		 wait.until(ExpectedConditions.visibilityOf(vt.selectSale())).click();
		 vt.amount().clear();
		 wait.until(ExpectedConditions.visibilityOf(vt.amount())) .sendKeys(excel.getdata(2, 1, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.taxAmount())).sendKeys(excel.getdata(2, 2, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.accountNumber())).sendKeys(excel.getdata(2, 9, 1));
		 wait.until(ExpectedConditions.visibilityOf( vt.routingNumber())).sendKeys(excel.getdata(2, 10, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.nameOnCheck())).sendKeys(excel.getdata(2, 11, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.checking())).click();
		 wait.until(ExpectedConditions.visibilityOf(vt.phoneNumber())).sendKeys(excel.getdata(2, 12, 1));
		// wait.until(ExpectedConditions.visibilityOf(vt.accountHolder())).sendKeys(excel.getdata(2, 7, 1));
		 wait.until(ExpectedConditions.elementToBeClickable(vt.processBtn())).click();
		 
		 if(vt.transactionReceipt().isDisplayed()){
			 steps_login.TransactionType =wait.until(ExpectedConditions.visibilityOf(vt.selectTransactionType())).getText();
			 steps_login.TransactionId = vt.transactionId().getText();
				System.out.println("The transcation Type and id for CHECK21 SALE displayed on receipt is "+steps_login.TransactionType +"  , "+steps_login.TransactionId);
				
				
					
		 wait.until(ExpectedConditions.elementToBeClickable(vt.receiptClose())).click();
		 }
		 
		 else {
			 System.out.println("Unable to process Transactions");
			 
		 }
	}

	

	@When("select Cash Sale and perform the transcation")
	public void select_Cash_Sale_and_perform_the_transcation() throws Throwable {
		Thread.sleep(3000);
		vt.selectPaymentMethod().click();
		Thread.sleep(3000);
		 vt.selectCash().click();
		 wait.until(ExpectedConditions.visibilityOf( vt.selectTransactionType())).click();
		 wait.until(ExpectedConditions.visibilityOf(vt.selectSale())).click();
		 vt.amount().clear();
		 wait.until(ExpectedConditions.visibilityOf(vt.amount())) .sendKeys(excel.getdata(2, 1, 1));
		 wait.until(ExpectedConditions.visibilityOf(vt.taxAmount())).sendKeys(excel.getdata(2, 2, 1));
		
		 wait.until(ExpectedConditions.elementToBeClickable(vt.processBtn())).click();
		 
		 if(vt.transactionReceipt().isDisplayed()){
			 steps_login.TransactionType =wait.until(ExpectedConditions.visibilityOf(vt.selectTransactionType())).getText();
			 steps_login.TransactionId = vt.transactionId().getText();
				System.out.println("The transcation Type and id for CASH SALE displayed on receipt is "+steps_login.TransactionType +"  , "+steps_login.TransactionId);
				
				
					
		 wait.until(ExpectedConditions.elementToBeClickable(vt.receiptClose())).click();
		 }
		 
		 else {
			 System.out.println("Unable to process Transactions");
			 
		 }
	}

	

	@Then("All Primary transcations are Performed")
	public void all_Primary_transcations_are_Performed() {
		 System.out.println("Performed all the Primary Transcations");
	}

	
}
