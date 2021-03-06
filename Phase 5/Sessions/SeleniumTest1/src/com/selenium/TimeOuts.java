package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TimeOuts {

	public static void main(String[] args) {
		// set the driver property
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);

		driver.close();
	}
}