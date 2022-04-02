package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookTest2 {

	public static void main(String[] args) {
		// set the driver property
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");

		WebElement email = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));

		email.sendKeys("pankaj214654@gmail.com");
		pass.sendKeys("Pankaj@1123");

		WebElement login = driver.findElement(By.name("login"));
		login.submit();
		// driver.close();
	}
}