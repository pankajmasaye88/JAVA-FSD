package com.selenium.session2;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TabDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("window.open('https://www.google.co.in/','_blank')");

		ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list.get(1));
		Thread.sleep(5000);
		driver.switchTo().window(list.get(0));
	}
}