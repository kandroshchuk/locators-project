package com.ka;

import java.util.concurrent.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.safari.*;
import org.testng.annotations.*;

public class BasicTest {

	static String baseURL = "http://google.com";

	static WebDriver driver;

	public BasicTest(String baseURL) {
		this.baseURL = baseURL;
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@BeforeClass
	public void setupChrome() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@BeforeClass(enabled = false)
	public void setupFirefox() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@BeforeClass(enabled = false)
	public void setupSafari() {
		driver = new SafariDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL);
	}
}
