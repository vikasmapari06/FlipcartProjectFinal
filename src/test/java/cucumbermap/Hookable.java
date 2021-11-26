package cucumbermap;

import java.net.UnknownHostException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.HTMLReportGenerator;

public class Hookable 
{
	
	@Before
	public void beforeMethod(Scenario scenario) throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("F:\\Data\\Automation\\Flipcart Final\\Report\\flipcart.html", "FlipcartProject");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		System.out.println("...............Scenario Starts.................");
		
	}
	
	@After
	public void afterMethod(Scenario scenario)
	{
		System.out.println("...............Scenario Ends.................");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd(); 
	}
}
