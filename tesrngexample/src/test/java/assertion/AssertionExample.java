package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AssertionExample {
	
	WebDriver driver=null;
	@Test
	void method1()
	{
		System.out.println("Verify login page");
		
		int a=8;
		
		//Assert.assertFalse(a<10);
		
		 driver = new ChromeDriver();
		 
		 Assert.assertNotNull(driver);
		
		driver.get("https://www.automationexercise.com/login");
		
		String expectedTitle="Login";
		String actualTitle=driver.getTitle();
		
		Assert.assertNotEquals(expectedTitle, actualTitle);
		driver.quit();
		
		
	}
	
	//browser=br;
	@Parameters({"br"})
	@Test
	void method2(String browser)
	{
		System.out.println("Verify login page");
		
		if(browser.equals("chrome"))
		
		 driver = new ChromeDriver();
		else if(browser.equals("firefox"))
			driver = new FirefoxDriver();
		else if(browser.equals("IEdge"))
			driver= new EdgeDriver();
		
		 Assert.assertNotNull(driver);
		
		driver.get("https://www.automationexercise.com/login");
		
	}

}
