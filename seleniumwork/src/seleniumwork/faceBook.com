package seleniumwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("sruthiguppana@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("sruthisanju");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.close()
		
	}

}
