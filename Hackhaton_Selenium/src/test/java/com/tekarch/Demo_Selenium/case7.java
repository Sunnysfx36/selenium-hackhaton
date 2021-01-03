package com.tekarch.Demo_Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class case7 {
	

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
		driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@id='PersonalInfo_font']")).click();
		driver.findElement(By.xpath("//span[@id='LoginHistory_font']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();
		driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']")).click();
		driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']")).click();
		WebElement drop = driver.findElement(By.xpath("//select[@id='p4']"));
		Select select = new Select (drop);
		select.selectByVisibleText("Salesforce Chatter");
		driver.findElement(By.xpath("//option[contains(text(),'Reports')]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[2]/a[1]/img[1]")).click();
		driver.findElement(By.xpath("//span[@id='EmailSetup_font']")).click();
		driver.findElement(By.xpath("//span[@id='EmailSettings_font']")).click();
		List <WebElement >radio_button = driver.findElements(By.name("use_external_email"));
		boolean bvalue;
		bvalue = radio_button.get(1).isSelected();
		if(bvalue == false)
		{
			radio_button.get(1).click();
		}
		else
		{
			System.out.println("It is already selected,Select other option");
			}
		
        driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).click();
        driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']")).click();
        driver.findElement(By.xpath("//span[@id='Reminders_font']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='testbtn']")).click();
        
        
	}
	
		
	

}
