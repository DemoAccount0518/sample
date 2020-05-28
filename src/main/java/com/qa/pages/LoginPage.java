package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{
	//PageFactory -Object Repository
	@FindBy(id="username")
	WebElement usernameBox;

	@FindBy(id="password")
	WebElement passwordBox;

	@FindBy(id="login")
	WebElement loginButton;
	//Steps number
	public void setUserName(String userName) {
			usernameBox.sendKeys(userName);
		}
		
		public void setPassword(String password) {
			passwordBox.sendKeys(password);
		}
		
		public void clickSubmit() {
			loginButton.click();
		}
		
		//Actions
		public void login(String userName, String password) {
			setUserName(userName);
			setPassword(password);
			clickSubmit();
		}
		
		public void loginDD(String userName, String password) {
			setUserName(userName);
			setPassword(password);
			clickSubmit();
		}
		
		public String validateLoginPageTitle() {
			return driver.getTitle();
		}
		
		//Constructor initializes the state of the driver.
		public LoginPage() {
			
			//Initialize webElements.
			PageFactory.initElements(driver, this);
		}

}
