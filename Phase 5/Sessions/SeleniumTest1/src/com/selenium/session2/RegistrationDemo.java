package com.selenium.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RegistrationDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.shine.com/registration/parser/");

		WebElement name = driver.findElement(By.cssSelector("#id_name"));
		name.sendKeys("Pankaj Masaye");

		WebElement email = driver.findElement(By.cssSelector("#id_email"));
		email.sendKeys("pankaj@gmail.com");

		WebElement phone = driver.findElement(By.cssSelector("#id_cell_phone"));
		phone.sendKeys("1234567890");

		WebElement pass = driver.findElement(By.cssSelector("#id_password"));
		pass.sendKeys("Pankaj@123");

		WebElement check = driver.findElement(By.cssSelector("#id_privacy"));
		if (!check.isSelected()) {
			check.click();
		}

		WebElement button = driver.findElement(By.cssSelector("#registerButton"));
		// button.submit();

	}
}