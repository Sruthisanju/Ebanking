package com.Ranford.scripts;

import org.openqa.selenium.WebDriver;

public class basicScript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.in");

	}

}
