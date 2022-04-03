package com.simplilearn.testngselenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;

public class FacebookTest {
	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();
	}

	@AfterMethod
	public void afterMethod() {
		driver = null;
	}

	@Test(groups = "FB")
	public void launchFb() {
		driver.get("https://www.facebook.com/");
	}

	@Test(groups = "FB", dependsOnMethods = { "launchFb" })
	public void login() {
		driver.findElement(By.id("email")).sendKeys("pankaj@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Pankaj@123");
		driver.findElement(By.name("login")).submit();
		driver.close();
	}

}