package com.tekarch.Demo_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test4b {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/sunnyfernandes/eclipse-workspace/Demo_Selenium/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//a[@class='dropdown-toggle disabled']"));
		ele.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		username.sendKeys("123");
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.clear();
		pwd.sendKeys("abc");
		WebElement chk = driver.findElement(By.xpath("//input[@id='rememberUn']"));
		chk.click();
		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));
		login.click();
	}

}
