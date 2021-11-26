package utility;

public class Calling 
{
	public static void main(String[] args) 
	{
		//Browser Launch
		 Object[] input= new Object[2];
		 input[0] = "FF";
		 input[1] = "F:\\Automation support\\geckodriver.exe";
		 SeleniumOperations.browserLaunch(input);
		 
		//Open Application
		 Object[] input1= new Object[1];
		 	      input1[0] = "https://www.flipkart.com";
		 SeleniumOperations.openApplication(input1);
		 
		//Click on Cancel
		 Object[] input2= new Object[1];
		 		  input2[0] = "//button[@class='_2KpZ6l _2doB4z']";
		 SeleniumOperations.clickOnElement(input2);
		 
		//Move on Element
		 Object[] input3= new Object[1];
		 		  input3[0] = "//*[@class='_28p97w']";
		 SeleniumOperations.moveToElement(input3);
		 
		//Click on my Profile
		 Object[] input4= new Object[1];
		 		  input4[0] = "//*[text()='My Profile']";
		 SeleniumOperations.clickOnElement(input4);
		 
		 //Send Username
		 Object[] input5= new Object[2];
				 input5[0] = "//input[@class='_2IX_2- VJZDxU']";
				 input5[1] = "vikasmapari06@gmail.com";
				 SeleniumOperations.sendKeys(input5);
		 //Send Password
		 Object[] input6= new Object[2];
				 input6[0] = "//input[@class='_2IX_2- _3mctLh VJZDxU']";
				 input6[1] = "vikas26884";
		 SeleniumOperations.sendKeys(input6);
		
		 //Click on Login
				 Object[] input7= new Object[1];
				 		  input7[0] = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']";
				 SeleniumOperations.clickOnElement(input7);
			 
		 //Click on Validation
				 Object[] input8= new Object[2];
				  		  input8[0] = "Vikas Mapari";
				  		  input8[1] = "//*[text()='Vikas Mapari']";
				 SeleniumOperations.validation(input8);
	}
}
