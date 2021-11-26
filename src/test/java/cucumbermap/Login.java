package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login 
{
	
	@Given ("^user open browser \"(.*)\" with exe \"(.*)\"$")
	public void browserL(String bname, String exe)
	{
		Object[] input= new Object[2];
				 input[0] = bname;
				 input[1] = exe;
				 SeleniumOperations.browserLaunch(input);
	}
	
	@Given ("^user enter url as \"(.*)\"$")
	public void openUrl(String url)
	{
		Object[] input1= new Object[1];
				 input1[0] = "https://www.flipkart.com";
			     SeleniumOperations.openApplication(input1);
	}
	
	@Given ("^user cancel initial login button$")
	public void cancelLogin()
	{
		Object[] input2= new Object[1];
				 input2[0] = "//button[@class='_2KpZ6l _2doB4z']";
				 SeleniumOperations.clickOnElement(input2);
	}
	
	@Given ("^user move on Login button$")
	public void move()
	{
		Object[] input3= new Object[1];
				 input3[0] = "//*[@class='_28p97w']";
				 SeleniumOperations.moveToElement(input3);
	}
	
	@When ("^user click on my profile$")
	public void myProgile()
	{
		Object[] input4= new Object[1];
				 input4[0] = "//*[text()='My Profile']";
				 Hashtable<String, Object> output4 = SeleniumOperations.clickOnElement(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "^user click on my profile$", output4.get("MESSAGE").toString());
	}
	
	@When ("^user enter \"(.*)\" as username$")
	public void enterUsername(String uname)
	{
		Object[] input5= new Object[2];
				 input5[0] = "//input[@class='_2IX_2- VJZDxU']";
				 input5[1] = uname;
				 Hashtable<String, Object> output5 = SeleniumOperations.sendKeys(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "^user enter \"(.*)\" as username$", output5.get("MESSAGE").toString());
	}
	
	@When ("^user enter \"(.*)\" as password$")
	public void enterPassword(String pass)
	{
		Object[] input6= new Object[2];
				 input6[0] = "//input[@class='_2IX_2- _3mctLh VJZDxU']";
				 input6[1] = pass;
				 Hashtable<String, Object> output6 = SeleniumOperations.sendKeys(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "^user enter \"(.*)\" as password$", output6.get("MESSAGE").toString());
	}
	
	@When ("^user click on login button$")
	public void clickLogin()
	{
		Object[] input7= new Object[1];
				 input7[0] = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']";
				 Hashtable<String, Object> output7 =SeleniumOperations.clickOnElement(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "^user click on login button$", output7.get("MESSAGE").toString()); 
	}
	
	@Then ("^Application shows profile to user$")
	public void profile()
	{
		Object[] input8= new Object[2];
				 input8[0] = "Vikas Mapari";
				 input8[1] = "//*[text()='Vikas Mapari']";
				 Hashtable<String, Object> output8 = SeleniumOperations.validation(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "^Application shows profile to user$", output8.get("MESSAGE").toString()); 
	}
}
