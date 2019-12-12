package sikuliExamples;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	import org.sikuli.script.FindFailed;
	import org.sikuli.script.Pattern;
	import org.sikuli.script.Screen;
	public class UploadImage {
		@Test
		public void handlefileUpload() throws InterruptedException, FindFailed
		{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anusha\\Desktop\\Selenium-eclipse\\chromedriver.exe");
			WebDriver  driver=new ChromeDriver();
			
			 driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_accept");
		     Thread.sleep(5000);
		    //Implementing Sikuli
		     Screen s=new Screen();
		     Thread.sleep(5000);
		     //To Perform Click Operation click() Method
		     s.click("D:\\Intellipaat_June22nd2019\\myproject\\src\\sikuli Locators\\ChooseFile.PNG"); 
		     Thread.sleep(5000);
		     Pattern fileInput=new Pattern("D:\\Intellipaat_June22nd2019\\myproject\\src\\sikuli Locators\\Input_Path.PNG");
		     Pattern openButton=new Pattern("D:\\Intellipaat_June22nd2019\\myproject\\src\\sikuli Locators\\Open_Enter.PNG");
		     //Wait time in Sikuli
		     s.wait(fileInput);
		     //To Send Data into TextBox
		     s.type(fileInput,"D:\\Intellipaat_June22nd2019\\myproject\\src\\sikuli Locators\\Demo1.PNG");
		     Thread.sleep(5000);
		     s.click(openButton);
		     Thread.sleep(5000);
		     s.click("D:\\Intellipaat_June22nd2019\\myproject\\src\\sikuli Locators\\Submit.PNG");
		     Thread.sleep(5000);
		     driver.close();
		
		}
	}
	