package org.pages;

import org.baseclass.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Baseclass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//input[@id='login']")
	private WebElement name;
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}

	@FindBy (xpath = "//input[@id='password']")
	private WebElement pin;
	
	@FindBy(xpath = "//button[normalize-space()='Login']")
	private WebElement loginBtn;

	public WebElement getName() {
		return name;
	}

	public void setName(WebElement name) {
		this.name = name;
	}

	public WebElement getPin() {
		return pin;
	}

	public void setPin(WebElement pin) {
		this.pin = pin;
	}
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
