package com.Ranford.master;

public class Exelib {

	public static void main(String[] args) throws InterruptedException {
		//instance class//
		Library1 LB=new Library1();
		LB.openApp("http://122.175.8.158/ranford2/");
		LB.adminLgn("Admin","Te$ting@");
		LB.BranchCreation("Sruthi","Ameerpet123", "12345","INDIA","Andhra Pradesh","Hyderabad");
		LB.RoleCreation("Sruthiguppana", "Manager", "E");
		LB.empCreation("Sarala","Sruthi","Manager","Begumpet");
        LB.admlgt();
        LB.appclose();
	}

}
