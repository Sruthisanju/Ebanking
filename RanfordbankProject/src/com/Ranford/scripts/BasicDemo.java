package com.Ranford.scripts;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","L:\\Selenium project\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://122.175.8.158/ranford2/");
		

	}

}
