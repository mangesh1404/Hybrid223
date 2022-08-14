package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage extends BaseClass {

	// webelements and methods
	
	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="password")
	private WebElement pass;

	@FindBy(xpath="//button")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//driver.findElement(By.id("email"));
	public void loginToApplication(String username, String password) {
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginBtn.click();
	}
}
