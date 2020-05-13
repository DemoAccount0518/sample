package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class DashboardPage extends TestBase{
@FindBy(xpath= "//h1[contains(text(),'Login')]" )
WebElement conf_msg;

@FindBy(id = "changepwdd")
WebElement changePasswordLink;

public DashboardPage() {
	
	PageFactory.initElements(driver, this);
	
}

public String conf_Msg() {
	String msg = conf_msg.getText();
	System.out.println(msg);
	return msg;
}

public void changePassword() {
	changePasswordLink.click();
}

}