package allClassFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Example1 {

	public WebDriver driver;
				@BeforeClass
		public void verifyTitle() throws InterruptedException
		{
		/*	Step-1Launch Chrome Browser*/
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anusha\\Desktop\\Selenium-eclipse\\chromedriver.exe");
			 driver=new ChromeDriver();	
		}
			

			
			
		@Test(priority=1)
		public void verifyGooglePage() throws InterruptedException
		{	
			
		//Step-2 Navigate to TestURL http://www.google.com
			driver.navigate().to(" http://www.google.com");
			// Wait 5 seconds	
			Thread.sleep(5000);
			//Place the Verification Point 
			String x=driver.getTitle();
			Assert.assertEquals(x, "Google");	
		}	
			
		
	@Test(priority=2)
	public void verifyFacebookPage() throws InterruptedException
	{	
		
	//Step-2 Navigate to TestURL http://www.google.com
		driver.navigate().to("https://www.facebook.com/");
		// Wait 5 seconds	
		Thread.sleep(5000);
		//Place the Verification Point 
		String x=driver.getTitle();
		Assert.assertEquals(x, "Facebook – log in or sign up");	
	}	

	@Test(priority=3)
	public void verifyBOI() throws InterruptedException
	{	
		
	//Step-2 Navigate to TestURL http://www.google.com
		driver.navigate().to("https://www.bankofindia.co.in/");
		// Wait 5 seconds	
		Thread.sleep(5000);
		//Place the Verification Point 
		String x=driver.getTitle();
		Assert.assertEquals(x, "BOI | Bank of India");	
	}	


		
			
			
			
		
		
		
		@AfterClass
		public void tearDown() throws InterruptedException
		{	
		//Step-5 Close Browser
			
			driver.close();
			
		}

	}

