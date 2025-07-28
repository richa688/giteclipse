package annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class basicexample {
	
	@Test(description="this is testcase1")
	void LoginWithCorrectData()
	{
		System.out.println("in testcase1");
		/*WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.automationexercise.com/login");
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("richa@gmail.com");		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("123456");
		//username.clear();
		driver.findElement(By.className("btn-default")).submit();
		*/
		Assert.fail();
	}
	
	@Test
	void LoginWithInCorrectData()
	{
		System.out.println("in testcase2");
		/*
	
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.automationexercise.com/login");
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("richa123@gmail.com");		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")).sendKeys("123456");
		//username.clear();
		driver.findElement(By.className("btn-default")).submit();
		*/
	}
	
	@Test(groups= {"regreesion","smoke"},dependsOnMethods = "LoginWithCorrectData")
	void alphaLogout()
	{
		System.out.println("in testcase3");
	}
	

}
