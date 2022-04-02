package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FacebookTest3 {

	public static void main(String[] args) {
		// set the driver property
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/signup");

		List<WebElement> list = driver.findElements(By.tagName("input"));

		for (WebElement w : list) {
			System.out.println(w.getAttribute("name"));
		}
	}
}