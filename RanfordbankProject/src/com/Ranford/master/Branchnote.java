package com.Ranford.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Branchnote {

	public static void main(String[] args) {
			
			//instance class
			Library1 Lb=new Library1();
			Lb.openApp("http://122.175.8.158/ranford2/");
			Lb.adminLgn("Admin","Te$ting@");
			
		//to get test data file path
			String Fpath="C:\\Users\\sruthi bindu\\eclipse-workspace\\RanfordbankProject\\src\\com\\Ranford\\testdata\\branch data (2).txt";
			
		//result file path
			String Rpath="C:\\Users\\sruthi bindu\\eclipse-workspace\\RanfordbankProject\\src\\com\\Ranford\\results\\branch data (2).txt";
			String SD;
			
		//to get test data file
			FileReader FR=new FileReader(Fpath);
			BufferedReader BR=new BufferedReader(FR);
			String Sread=BR.readLine();
			System.out.println(Sread);
			
		//write
			FileWriter FW=new FileWriter(Rpath);
			BufferedWriter BW=new BufferedWriter(FW);
			
			BW.write(Sread);
			BW.newLine();
			
		//multiple iterations
			while ((SD=BR.readLine())!=null) {
				

				System.out.println(SD);
				
		//split
				String SR[]=SD.split("@@@");
				String Bname=SR[0];
				String Badd1=SR[1];
				String Bzip=SR[2];
				String Cntry=SR[3];
				String State=SR[4];
				String City=SR[5];
				String Result=Lb.BranchCreation(Bname,Badd1,Bzip,Cntry,State,City);
				System.out.println(Result);
				
			
		//results
			BW.write(SD+"#^%$"+ Result);
			BW.newLine();
			
			}
			BW.close();
			BR.close();		
			

		}

	}

	}

}
