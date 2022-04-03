package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookTest {

	public static void main(String[] args) {
		// set the driver property
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");

		WebElement h2 = driver.findElement(By.className("_8eso"));
		System.out.println(h2.getText());

		WebElement email = driver.findElement(By.id("email"));
		System.out.println(email.getAttribute("placeholder"));

		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		link.click();
		// driver.close();
	}
}