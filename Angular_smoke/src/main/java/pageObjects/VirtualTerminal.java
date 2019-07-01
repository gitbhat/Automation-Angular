package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VirtualTerminal {
	WebDriver driver;
	 public VirtualTerminal(WebDriver driver)
	 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath=("//a[@class='show-vt']"))
	 WebElement virtualTerminal;
	 
	 public WebElement virtualTerminal(){
		 return virtualTerminal;
	 }
	 
	 
	//select the payment methods from VT page in the drop downs 
	 @FindBy(xpath=("(//a[@class='btn btn-simple dropdown-toggle ng-binding'])[4]"))
	 WebElement selectPaymentMethod;
	 
	 public WebElement selectPaymentMethod(){
		 return selectPaymentMethod;
	 }
	 
	 @FindBy(xpath=("(//ul[@class='dropdown-menu']//li//a[contains(text(),'Credit')])[3]"))
	 WebElement selectCreditCard;
	 
	 public WebElement selectCreditCard(){
		 return selectCreditCard;
	 }
	 
	 
	 @FindBy(xpath=("(//ul[@class='dropdown-menu']//li//a[contains(text(),'Cash')])[3]"))
	 WebElement selectCash;
	 
	 public WebElement selectCash(){
		 return selectCash;
	 }
	 
	 @FindBy(xpath=("(//ul[@class='dropdown-menu']//li[3]//a[contains(text(),'ACH')])"))
	 WebElement selectACH;
	 
	 public WebElement selectACH(){
		 return selectACH;
	 }
	 
	 @FindBy(xpath=("(//ul[@class='dropdown-menu']//li[4]//a[contains(text(),'Check')])"))
	 WebElement selectCheck;
	 
	 public WebElement selectCheck(){
		 return selectCheck;
	 }
	 
	 @FindBy(xpath=("(//ul[@class='dropdown-menu']//li[5]//a[contains(text(),'Check 21')])"))
	 WebElement selectCheck21;
	 
	 public WebElement selectCheck21(){
		 return selectCheck21;
	 }
	 
	 
	 // Select the transaction type
	 
	 @FindBy(xpath=("(//a[@class='btn btn-simple dropdown-toggle ng-binding'])[5]"))
	 WebElement selectTransactionType;
	 
	 public WebElement selectTransactionType(){
		 return selectTransactionType;
	 }
	 
	 
	 
	 @FindBy(xpath=("(//ul[@class='dropdown-menu']//li[1]//a[contains(text(),'Sale')])"))
	 WebElement selectSale;
	 
	 public WebElement selectSale(){
		 return selectSale;
	 }
	 
	 @FindBy(xpath=("(//ul[@class='dropdown-menu']//li[2]//a[contains(text(),'Auth')])"))
	 WebElement selectAuth;
	 
	 public WebElement selectAuth(){
		 return selectAuth;
	 }
	 
	 @FindBy(xpath=("(//ul[@class='dropdown-menu']//li[3]//a[contains(text(),'Refund')])"))
	 WebElement selectRefund;
	 
	 public WebElement selectRefund(){
		 return selectRefund;
	 }
	 
	 
	 @FindBy(xpath=("//input[@name='amount']"))
	 WebElement amount;
	 
	 public WebElement amount(){
		 return amount;
	 }
	 
	 @FindBy(xpath=("//input[@name='taxAmount']"))
	 WebElement taxAmount;
	 
	 public WebElement taxAmount(){
		 return taxAmount;
	 }
	 
	 @FindBy(xpath=("//input[@name='cardNumber']"))
	 WebElement cardNumber;
	 
	 public WebElement cardNumber(){
		 return cardNumber;
	 }
	 
	 @FindBy(xpath=("//input[@name='expMonth']"))
	 WebElement expMonth;
	 
	 public WebElement expMonth(){
		 return expMonth;
	 }
	 
	 
	 @FindBy(xpath=("//input[@name='expYear']"))
	 WebElement expYear;
	 
	 public WebElement expYear(){
		 return expYear;
	 }
	 
	 @FindBy(xpath=("//input[@name='cvv']"))
	 WebElement cvv;
	 
	 public WebElement cvv(){
		 return cvv;
	 }
	 
	 @FindBy(xpath=("//input[@name='accountHolder']"))
	 WebElement accountHolder;
	 
	 public WebElement accountHolder(){
		 return accountHolder;
	 }
	 
	 @FindBy(xpath=("//input[@name='streetAddress']"))
	 WebElement streetAddress;
	 
	 public WebElement streetAddress(){
		 return streetAddress;
	 }
	 
	 @FindBy(xpath=("//input[@name='invoiceNumber']"))
	 WebElement invoiceNumber;
	 
	 public WebElement invoiceNumber(){
		 return invoiceNumber;
	 }
	 
	 @FindBy(xpath=("//input[@name='poNumber']"))
	 WebElement poNumber;
	 
	 public WebElement poNumber(){
		 return poNumber;
	 }
	 
	 @FindBy(xpath=("//input[@name='customerId']"))
	 WebElement customerId;
	 
	 public WebElement customerId(){
		 return customerId;
	 }
	 
	 @FindBy(xpath=("//input[@name='zipCode']"))
	 WebElement zipCode;
	 
	 public WebElement zipCode(){
		 return zipCode;
	 }
	 
	 @FindBy(xpath=("//button[@class='btn btn-raised btn-info btn-sm text-sm']"))
	 WebElement clearBtn;
	 
	 public WebElement clearBtn(){
		 return clearBtn;
	 }
	 
	 @FindBy(xpath=("//button[@id='process-btn']"))
	 WebElement processBtn;
	 
	 public WebElement processBtn(){
		 return processBtn;
	 }
	 
	 @FindBy(xpath=("//div[@class='popup-content transaction-details-content slideIn']"))
	 WebElement transactionReceipt;
	 
	 public WebElement transactionReceipt(){
		 return transactionReceipt;
	 }
	 
	 @FindBy(xpath=("//td[contains(text(),'Transaction Id')]/following-sibling::td"))
	 WebElement transactionId;
	 
	 public WebElement transactionId(){
		 return transactionId;
	 }
	 
	 @FindBy(xpath=("(//th[@class='text-center ng-binding'])[2]"))
	 WebElement transactionType;
	 
	 public WebElement transactionType(){
		 return transactionType;
	 }
	 
	 
	 
	 @FindBy(xpath= ("(//button[@class='btn btn-raised btn-danger btn-sm text-sm close-popup'] )[2]"))
	 WebElement receiptClose;
	 
	 public WebElement receiptClose(){
		 return receiptClose;
	 }
	 
	 
	 
	
	 
	 @FindBy(xpath=("//input[@name='accountNumber']"))
	 WebElement accountNumber;
	 
	 public WebElement accountNumber(){
		 return accountNumber;
	 }
	 
	 @FindBy(xpath=("//input[@name='routingNumber']"))
	 WebElement routingNumber;
	 
	 public WebElement routingNumber(){
		 return routingNumber;
	 }
	 
	 @FindBy(xpath=("//input[@name='nameOnCheck']"))
	 WebElement nameOnCheck;
	 
	 public WebElement nameOnCheck(){
		 return nameOnCheck;
	 }
	 
	 @FindBy(xpath=("//div[@class='form-group label-floating is-empty col-md-12']  //input[@value='C']"))
	 WebElement checking;
	 
	 public WebElement checking(){
		 return checking;
	 }
	 
	 @FindBy(xpath=("//input[@name='phoneNumber']"))
	 WebElement phoneNumber;
	 
	 public WebElement phoneNumber(){
		 return phoneNumber;
	 }
	 
	 @FindBy(xpath=("//div[@class='form-group label-floating is-empty col-md-12']  //input[@value='S']"))
	 WebElement savings;
	 
	 public WebElement savings(){
		 return savings;
	 }
	 
	 
	 
	
	 
}
