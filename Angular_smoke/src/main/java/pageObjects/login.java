package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	WebDriver driver;
	 public login(WebDriver driver)
	 {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(id="username")
	 WebElement Username;
	 
	 @FindBy(id="password")
	 WebElement Password;
	 
	 @FindBy(id="login-btn")
	 WebElement ButtonLogin;
	 
	 public  WebElement Usern() {
		 return Username;
	 }
	 
	 public  WebElement Pass() {
		 return Password;
	 }
	 
	 public  WebElement btn() {
		 return ButtonLogin;
	 }

}
