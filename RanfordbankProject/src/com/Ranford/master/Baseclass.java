package com.Ranford.master;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Baseclass {
	Library1 LB=new Library1();{
		
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
      LB.adminLgn("Admin","Te$ting");
  }

  @AfterTest
  public void afterTest() {
      LB.BranchCreation("Sruthi","Ameerpet123", "12345","INDIA","Andhra Pradesh","Hyderabad");
  }

  @BeforeSuite
  public void beforeSuite() {
      LB.RoleCreation("Sruthiguppana", "Manager", "E");
  }

  @AfterSuite
  public void afterSuite() {
  LB.empCreation("Sarala","Sruthi","Manager","Begumpet");
  }
}

