package com.tekarch.Demo_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class case22 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/sunnyfernandes/eclipse-workspace/Demo_Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//a[@class='dropdown-toggle disabled']"));
		ele.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		username.sendKeys("sunnysfx36-yltd@force.com");
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.clear();
		pwd.sendKeys("Fernandes10");
		WebElement chk = driver.findElement(By.xpath("//input[@id='rememberUn']"));
		chk.click();
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='tryLexDialogX']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement leaddrop = driver.findElement(By.xpath("//select[@id='fcf']"));
		leaddrop.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/input[1]")).click();
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='dropdown-toggle disabled']")).click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='username']"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		username.sendKeys("sunnysfx36-yltd@force.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Fernandes10");
		
		driver.findElement(By.xpath("//input[@id='rememberUn']")).click();
	
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='tryLexDialogX']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		WebElement leaddrop1 = driver.findElement(By.xpath("//select[@id='fcf']"));
		leaddrop1.click();
		
	}

}
