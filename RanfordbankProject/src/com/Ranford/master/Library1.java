package com.Ranford.master;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
 

public class Library1 {

	WebDriver driver;
	String Expval,Actval;

	public  String openApp(String url) throws InterruptedException {
		Expval="Ranford Bank";
	//Firefox Browser//
      System.setProperty("webdriver.gecko.driver","L:\\Selenium project\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
	//to maximize browser//
		driver.manage().window().maximize();
	//Enter url//
		driver.get("http://122.175.8.158/ranford2/");
		Thread.sleep(3000);
		 Actval=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
   // to comparision//
		if(Expval.equalsIgnoreCase(Actval)) {
			System.out.println("Ranford Launch Successfully");
		}
		else
		{
			System.out.println("Ranford Launch failed");
		}
		return Actval;
	}
	public  String adminLgn(String un ,String pwd) throws InterruptedException {
		
		Expval="Welcome to Admin";
		driver.findElement(By.id("txtuId")).sendKeys(un);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		Thread.sleep(3000);
		 String Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	//to comparision//
		if(Expval.equalsIgnoreCase(Actval)) {
			System.out.println("Admin login Successfully");
		}
		else
		{
			System.out.println("Admin login  failed");
		}
		return Actval;
	}
	
	public  String BranchCreation(String Bname,String add1,String zipcode,String cntry,String state,String city) {
		Expval="Sucessfully";
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.id("BtnNewBR")).click();
		driver.findElement(By.id("txtbName")).sendKeys(Bname);
		driver.findElement(By.id("txtAdd1")).sendKeys(add1);
		driver.findElement(By.id("txtZip")).sendKeys(zipcode);
	//Dropdowns//
		Select cntry1=new Select(driver.findElement(By.id("lst_counrtyU")));
		cntry1.selectByVisibleText("INDIA");
		Select state1= new Select(driver.findElement(By.id("lst_stateI")));
		state1.selectByVisibleText("Andhra Pradesh");
		Select city1= new Select(driver.findElement(By.id("lst_cityI")));
		city1.selectByVisibleText("Hyderabad");
		driver.findElement(By.id("btn_insert")).click();
		String Actval=driver.switchTo().alert().getText();
	//comparision//
		if (Actval.contains(Expval))
{
			System.out.println("Branch Created");
} 
		else 
		{
			System.out.println("Branch Already Exist");
		}
	//to click home button//

	
		return Actval;
	}
	public  String RoleCreation(String rname,String rdes ,String Rtype) {
		Expval=" Sucessfully";
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		driver.findElement(By.id("btnRoles")).click();
		driver.findElement(By.id("txtRname")).sendKeys(rname);
		driver.findElement(By.id("txtRDesc")).sendKeys(rdes);
		Select rtype=new Select(driver.findElement(By.id("lstRtypeN")));
		rtype.selectByVisibleText("E");
		driver.findElement(By.id("btninsert")).click();
		String Actval=driver.switchTo().alert().getText();
	//comparision//
		if (Actval.contains(Expval))
		{
					System.out.println("Role Created");
		} 
				else 
				{
					System.out.println("Role Already Exist");
				}	
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[1]/a/img")).click();
		return Actval;
	}	
	public  String empCreation(String empname,String empLpwd,String emprole,String empbranch) {
		Expval=" Sucessfully";
		driver.findElement(By.xpath("/html/body/div/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
		driver.findElement(By.id("BtnNew")).click();
		driver.findElement(By.id("txtUname")).sendKeys(empname);
		driver.findElement(By.id("txtLpwd")).sendKeys(empLpwd);
		Select Emprole=new Select(driver.findElement(By.id("lst_Roles")));
		Emprole.selectByVisibleText("Manager");
		Select Empbranch=new Select(driver.findElement(By.id("lst_Branch")));
		Empbranch.selectByVisibleText("Begumpet");
		
		driver.findElement(By.id("BtnSubmit")).click();
		String Actval=driver.switchTo().alert().getText();
	//comparision//
		if (Actval.contains(Expval))
		{
					System.out.println("Employee Created");
		} 
				else 
				{
					System.out.println("Employee Already Exist");
				}	
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[1]/a/img")).click();
		return Actval;
	}	
	public void admlgt()
	   
	   {
	  	 driver.findElement(By.xpath(".//*[@id='Table_02']/tbody/tr/td[3]/a/img")).click();
	  	 
	  	 }

	   public void appclose()
	   {
	  	 driver.close();
	   }
}