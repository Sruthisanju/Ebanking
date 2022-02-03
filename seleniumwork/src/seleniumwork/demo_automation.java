package seleniumwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo_automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Sruthi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Guppana");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("sruthiguppana@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9381694495");
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='id='checkbox3']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Sruthi@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Sruthi@123");
		Thread.sleep(3000);
		driver.close();
}
}
