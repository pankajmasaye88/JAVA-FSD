package com.simplilearn.Phase5Pro;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomateWebTestNGPro2 {

	WebDriver driver = null;

	@Test(groups = "Amazon")
	public void launchAmazon() {
		System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		driver = new EdgeDriver();

		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

	}

	@Test(groups = "Amazon", dependsOnMethods = { "launchAmazon" })
	public void login() {

		driver.findElement(By.id("ap_email")).sendKeys("pankaj123@gmail.com");

		driver.findElement(By.id("continue")).submit();

		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(groups = "Amazon", dependsOnMethods = { "login" })
	public void login2() {

		driver.findElement(By.id("ap_password")).sendKeys("password123");
		;
		driver.findElement(By.id("signInSubmit")).submit();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.close();
	}

}
