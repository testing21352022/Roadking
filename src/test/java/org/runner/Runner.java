package org.runner;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.HomePage;
import org.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Runner extends HomePage {

	@DataProvider(name = "loginDataProvider")
	public Object[][] LoginData() {
		return new Object[][] { { "testing21352022@gmail.com", "1234586798", false },
				{ "testing2135202222@gmail.com", "123456", false },
				{ "admin@roadkingaustralia.com.au", "123456", true },

				// { "invalid_user", "invalid_pass" },
				// { "", "" }, // blank username/password
				// { "locked_user", "valid_pass" } // locked account scenario
		};
	}

	@BeforeClass
	public void beowserlunch() {
		browserlunch();
		urlLunch("https://anaxusdemo.com.au/roadking/login");
		String actualUrl = "https://anaxusdemo.com.au/roadking/login";
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualUrl, currentUrl, "Url Not verified");

	}

	@Test(dataProvider = "loginDataProvider", priority = 1)
	public void loginpage1(String username, String Passowrd, boolean result) {

		LoginPage p = new LoginPage();
		p.getName().sendKeys(username);
		p.getPin().sendKeys(Passowrd);
		p.getLoginBtn().click();
		driver.navigate().refresh();

		// Login icon verification
		SoftAssert softAssert = new SoftAssert();
		boolean displayedSts = driver.findElement(By.xpath("//img[@alt='img']")).isDisplayed();
		softAssert.assertEquals(result, displayedSts);

		// URL Verification
		// String currentUrl = driver.getCurrentUrl();
		// String expectedUrl = "https://anaxusdemo.com.au/roadking/admin/dashboard";
		// Assert.assertEquals(currentUrl, expectedUrl);

	}

	@Test(priority = 2)
	public void Homepage() throws InterruptedException {
		HomePage h = new HomePage();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		h.getSetting().click();
		Thread.sleep(5000);
		h.getAddShift().click();
		Thread.sleep(5000);
		h.startTime.click();
		Thread.sleep(5000);
		h.time.click();
		
		
//		List<WebElement> element = driver.findElements(By.xpath("//div[@class='tempus-dominus-widget light show']"));
//		System.out.println(element);
	}

	// @Test(dataProvider = "loginDataProvider")
	// public void loginpage2(String username, String Passowrd) {
	// Pages p = new Pages();
	// p.getName().sendKeys(username);
	// p.getPin().sendKeys(Passowrd);
	// if (p.getLoginBtn().isEnabled()) {
	// p.getLoginBtn().click();
	// }
	// String currentUrl = driver.getCurrentUrl();
	// String ActualURl = "https://anaxusdemo.com.au/roadking/admin/dashboard";
	// SoftAssert soft = new SoftAssert();
	// soft.assertEquals(ActualURl, currentUrl, "Url Not verified");
	// driver.navigate().refresh();
	//
	// }
	//
	// @Test(dataProvider = "loginDataProvider")
	// public void loginpage3(String username, String Passowrd) {
	// Pages p = new Pages();
	// p.getName().sendKeys(username);
	// p.getPin().sendKeys(Passowrd);
	// p.getLoginBtn().click();
	// String currentUrl = driver.getCurrentUrl();
	// String ActualURl = "https://anaxusdemo.com.au/roadking/admin/dashboard";
	// assertEquals(currentUrl, ActualURl, "URL has been differed.");
	//
	// }

//	 @AfterMethod
//	 public void quit() {
//	 browserQuit();
//	 }

}
