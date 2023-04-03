package org.newproject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserlaunch {

	@Test
	public void mmt() {

		WebDriverManager.chromedriver().setup();

		ChromeOptions opt = new ChromeOptions();
	    opt.addArguments("start-maximized");
		opt.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://www.instagram.com/");
		

	}
}
