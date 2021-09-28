package com.qa.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
	
	
	// Selenium code is written in JAVA methods
	// testNG annotation to execute your method
	//========================================================
	//Moved ground plane
	//Made ground green
	//Added red cube

	//made changes in pt-car
	//Checked car and renamed
	//changes made for banch-work1
	//========================================================
	@Test
	public void testaddressbook() throws InterruptedException
	{
		
		// open Chrome browser
		
	WebDriver driver = new ChromeDriver();
	
	// open the url on the browser
	
	driver.get("http://34.121.47.187:49153/addressbook/");
	
	// methods to maximize the browser window
	
	driver.manage().window().maximize();
	
	// to perform testing on different webelements with selenium
	
	// driver.findElement(address of element).action
	
	// address of element: you can find it from the attributes of an element
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div/div[1]/div/div/div[2]/div")).click();
	
	// selenium wait for 3 seconds
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[2]/td[3]/input")).sendKeys("Tom");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]/input")).sendKeys("Mathew");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[4]/td[3]/input")).sendKeys("123456789");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[5]/td[3]/input")).sendKeys("abc@gmail.com");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[6]/td[3]/div/input")).sendKeys("5/19/21,");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[3]/div/div[1]/div")).click();
	
	Thread.sleep(3000);
	
	System.out.println(driver.getTitle());
	
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
	}

}
