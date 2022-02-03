package com.Ranford.master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Samplescript {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.gecko.driver","L:\\Selenium project\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://122.175.8.158/ranford2/");
		Thread .sleep(3000);
   //admin login//
	    driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Te$ting@");
		driver.findElement(By.id("login")).click();
   //branch Creation//
	    driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.name("BtnNewBR")).click();
		driver.findElement(By.name("txtbName")).sendKeys("sruthi");
		driver.findElement(By.name("txtAdd1")).sendKeys("Ameerpet123");
		driver.findElement(By.id("txtZip")).sendKeys("12345");
		Select ctry=new Select(driver.findElement(By.name("lst_counrtyU")));
		ctry.selectByVisibleText("INDIA");
		Select ctry1=new Select(driver.findElement(By.name("lst_stateI")));
		ctry1.selectByVisibleText("GOA");
		Select city=new Select(driver.findElement(By.name("lst_cityI")));
		city.selectByVisibleText("GOA");
		driver.findElement(By.id("btn_insert")).click();
		Thread.sleep(1000);
  //Role creation//
		driver.findElement(By.xpath("//*[@id=\"Table_02\"]/tbody/tr/td[1]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		driver.findElement(By.id("txtRname")).sendKeys("sruthiguppana");
		driver.findElement(By.id("txtRDesc")).sendKeys("Manager");
		Select rtype=new Select(driver.findElement(By.id("lstRtypeN")));
		rtype.selectByVisibleText("E");
		driver.findElement(By.id("btninsert")).click();
  //Emp creation//	
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
		driver.findElement(By.id("BtnNew")).click();
		driver.findElement(By.id("txtUname")).sendKeys("Sarala");
		driver.findElement(By.id("txtLpwd")).sendKeys("Sruthi");
		Select Emprole=new Select(driver.findElement(By.id("lst_Roles")));
		Emprole.selectByVisibleText("Manager");
		Select Empbranch=new Select(driver.findElement(By.id("lst_Branch")));
		Empbranch.selectByVisibleText("Begumpet");
		driver.findElement(By.id("BtnSubmit")).click();
}

}
