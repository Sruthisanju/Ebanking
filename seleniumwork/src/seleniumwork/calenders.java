package seleniumwork;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenders {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\CHROMEDRIVER\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:redbus.com");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("tirupathi");
		String stdate= "28-Oct-2021";
		String rtnDate = "31-Oct-2021";
		String dateArray[] = stdate.split("-");
		String day = dateArray[0];
		String mon = dateArray[1];
		String year = dateArray[2];
		String rtnDateArray[] = rtnDate.split("-");
		String rtnDay = rtnDateArray[0];
		String rtnMonth = rtnDateArray[1];
		String rtnYear = rtnDateArray[2];
		System.out.println("Start Date is .... "+day + "..of.."+mon);
		String url = "http://redbus.com";
		int s2 = 3000;
		driver.get(url);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Vijayawada");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[contains(text(),'Onward')]")).click();
	//	String mnTitle= driver.findElement(By.xpath("//table/tbody/tr/td[@class='monthTitle']")).getText();
	//	System.out.println(mnTitle);
		List<WebElement> days = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
		System.out.println("total columns --"+days.size());
		for(int c=0; c<days.size();c++)
		{
			String colVal = days.get(c).getText();
			if(day.equals(colVal))
			{
				days.get(c).click();
				break;
			}
		//	System.out.println(colVal);
		}
		driver.findElement(By.xpath("//label[@for='return_cal']")).click();
		List <WebElement> rtnDays = driver.findElements(By.xpath("//div[@id='rb-calendar_return_cal']/table/tbody/tr/td"));
		for(int c1=0;c1<rtnDays.size();c1++)
		{
			String rtnCol = rtnDays.get(c1).getText();
			if(rtnCol.equals(rtnDay))
			{
				rtnDays.get(c1).click();
				break;
			}
	}
	}
}


