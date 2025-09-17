package org.baseclass;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public static WebDriver driver;

	public static WebDriver browserlunch() {
		
		ChromeOptions options = new ChromeOptions();

        // Set notification preference to "allow"
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 1); // 1 = Allow, 2 = Block
        options.setExperimentalOption("prefs", prefs);

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		return driver;
		
	}

//	public static void lunchBrowser(String browserName) {
//		if (browserName.equalsIgnoreCase("chrome")) {
//			ChromeOptions Options = new ChromeOptions();
//			Options.addArguments("--remote-allow-origins=*");
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver(Options);
//		} else if (browserName.equalsIgnoreCase("edge")) {
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		} else {
//			System.err.println("Invalide Browsername");
//		}
//
//	}

	public static void urlLunch(String u) {
		driver.manage().window().maximize();
		driver.get(u);
		

	}

	public static void sendKeys(WebElement e, String Value) {
		e.sendKeys(Value);
	}

	public static void click(WebElement e) {
		e.click();

	}

	public static String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}

	public static void browserQuit() {
		driver.quit();
	}

}
