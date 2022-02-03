import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class workwithAlerts {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");
       WebDriver driver =new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
       driver.get("http://demo.automationtesting.in/");
       Thread.sleep(3000);
       Actions act = new Actions(driver);
       driver.findElement(By.xpath("//img[@src='enter.png']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[contains(text(),'Alerts')]")).click();
       Thread.sleep(2000);
 //      driver.findElement(By.xpath("//a[contains(text(),'Cancel')]")).click();
       WebElement OKCancel = driver.findElement(By.xpath("//a[contains(text(),'Cancel')]"));
       act.moveToElement(OKCancel).click().perform();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
       Thread.sleep(2000);
       Alert alert2 = driver.switchTo().alert();
      // alert2.accept();
       alert2.dismiss();
       Thread.sleep(2000);
       String txt = driver.findElement(By.xpath("//p[@id='demo']")).getText();
       System.out.println(txt);
       driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
       Thread.sleep(2000);
       Alert alert1=driver.switchTo().alert();
       alert1.accept();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[contains(text(),'Textbox')]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
       Thread.sleep(2000);
       Alert alert3 = driver.switchTo().alert();
       alert3.sendKeys("Mindq");
       alert3.accept();
       Thread.sleep(2000);
       String txt1 = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
       System.out.println(txt1);
       
       
       
	}

}
