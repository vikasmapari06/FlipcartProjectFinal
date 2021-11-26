package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "F:\\Automation support\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//Open Application
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//Click on cancel button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//Navigate on login
		Actions act = new Actions(driver);
		WebElement log = driver.findElement(By.xpath("//*[@class='_28p97w']"));
		act.moveToElement(log).build().perform();
		//Click on Myprofile
		//Thread.sleep(5000);
		WebElement prof = driver.findElement(By.xpath("(//*[@class='_3vhnxf'])[1]"));
		act.click(prof).build().perform();
		//Enter Email
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("vikasmapari06@gmail.com");
		//Enter Password
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("vikas26884");
		//Click on login button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		//Click on Manage address
		driver.findElement(By.xpath("//*[@class='NS64GK']")).click();
		//Click on Add new address
		driver.findElement(By.xpath("//*[@class='_1QhEVk']")).click();
		
		//Add information
		driver.findElement(By.xpath("//*[@name='name']")).sendKeys("Vik");
		driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("9922711317");
		driver.findElement(By.xpath("//*[@name='pincode']")).sendKeys("411019");
		driver.findElement(By.xpath("//*[@name='addressLine2']")).sendKeys("Chinchwad");
		driver.findElement(By.xpath("//*[@name='addressLine1']")).sendKeys("Pune");
		//Click on radio button
		driver.findElement(By.xpath("(//*[@class='_1XFPmK'])[1]")).click();
		//Click on save
		driver.findElement(By.xpath("//*[@type='button']")).click();

	}
}
