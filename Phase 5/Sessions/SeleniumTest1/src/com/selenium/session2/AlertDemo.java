package com.selenium.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("https://nxtgenaiacademy.com/alertandpopup/");

//		WebElement button1= driver.findElement(By.name("alertbox"));
//		button1.click();
//		
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();

//		WebElement button2= driver.findElement(By.name("confirmalertbox"));
//		button2.click();
//		
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().dismiss();

		WebElement button3 = driver.findElement(By.name("promptalertbox1234"));
		button3.click();
		driver.switchTo().alert().sendKeys("Yes");
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

	}
}