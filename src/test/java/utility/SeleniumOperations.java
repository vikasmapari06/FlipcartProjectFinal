package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations 
{
	public static WebDriver driver=null;
	
	public static Hashtable<String, Object> outputParameters = new Hashtable<String, Object>();
	
	//Browser Launch
	public static Hashtable<String, Object> browserLaunch(Object[] inputParameters)
	{
		try {
		String strBrowserName = (String) inputParameters[0];
		String webDriverExePath = (String) inputParameters[1];
		if(strBrowserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", webDriverExePath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}else
			if(strBrowserName.equalsIgnoreCase("FF"))
			{
				System.setProperty("webdriver.gecko.driver", webDriverExePath);
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:browserLaunch, Input_Data:" + inputParameters[1].toString());
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:browserLaunch, Input_Data:" + inputParameters[1].toString());
		}
		return outputParameters;
	}
	
	//Open Application
	public static Hashtable<String, Object> openApplication(Object[] inputParameters)
	{
		try {
		String strURL = (String) inputParameters[0];
		driver.get(strURL);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "openApplication, Input_Data:" + inputParameters[0].toString());
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "openApplication, Input_Data:" + inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	//Click on Element
	public static Hashtable<String, Object> clickOnElement(Object[] inputParameters)
	{
		try {
		String element = (String) inputParameters[0];
		driver.findElement(By.xpath(element)).click();
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "clickOnElement, Input_Data:" + inputParameters[0].toString());
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "Fail");
			outputParameters.put("MESSAGE", "clickOnElement, Input_Data:" + inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	//Move on Element
	public static Hashtable<String, Object> moveToElement(Object[] inputParameters)
	{
		try {
		String element = (String) inputParameters[0];
		Actions act = new Actions(driver);
		WebElement log = driver.findElement(By.xpath(element));
		act.moveToElement(log).build().perform();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "moveToElement, Input_Data:" + inputParameters[0].toString());
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "moveToElement, Input_Data:" + inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	//Send keys
	public static Hashtable<String, Object> sendKeys(Object[] inputParameters)
	{
		try {
		String xpath = (String) inputParameters[0];
		String key = (String) inputParameters[1];
		driver.findElement(By.xpath(xpath)).sendKeys(key);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "sendKeys, Input_Data:" + inputParameters[1].toString());
		}catch(Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "sendKeys, Input_Data:" + inputParameters[1].toString());
		}
		return outputParameters;
	}
	
	// Validation
		public static Hashtable<String, Object> validation(Object[] inputParameters)
		{
			try {
			String givenText = (String) inputParameters[0];
			String xpath = (String) inputParameters[1];
			String ele=driver.findElement(By.xpath(xpath)).getText();
			if(givenText.equalsIgnoreCase(ele))
			{
				System.out.println("Test case pass");
			}
			else
			{
				System.out.println("Test case fail");
			}
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "validation, Input_Data:" + inputParameters[0].toString());
			}catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "validation, Input_Data:" + inputParameters[0].toString());
			}
			return outputParameters;
		}
}
