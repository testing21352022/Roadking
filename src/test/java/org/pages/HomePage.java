package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends LoginPage {
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	private WebElement notification;
	
	@FindBy(xpath = "//span[normalize-space()='Settings']")
	public WebElement setting;
	
	@FindBy(xpath = "//button[@class='add-time']")
	public WebElement addShift;
	
	@FindBy(xpath = "//div[@id='startPicker5']")
	public WebElement startTime;
	
	@FindBy(xpath = "//div[@class='tempus-dominus-widget light show']//div[@class='hour'][normalize-space()='10']")
	public WebElement time;
	
	

	public WebElement getStartTime() {
		return startTime;
	}

	public void setStartTime(WebElement startTime) {
		this.startTime = startTime;
	}

	public WebElement getAddShift() {
		return addShift;
	}

	public void setAddShift(WebElement addShift) {
		this.addShift = addShift;
	}

	public WebElement getSetting() {
		return setting;
	}

	public void setSetting(WebElement setting) {
		this.setting = setting;
	}

	public WebElement getNotification() {
		return notification;
	}

	public void setNotification(WebElement notification) {
		this.notification = notification;
	}

}
