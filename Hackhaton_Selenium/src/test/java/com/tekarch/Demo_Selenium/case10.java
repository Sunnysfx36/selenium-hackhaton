package com.tekarch.Demo_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class case10 {

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
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//body/div[@id='contentWrapper']/div[@id='AppBodyHeader']/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]")).click();
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).click();
		driver.findElement(By.xpath("//input[@id='acc2']")).sendKeys("abcd");
		
		WebElement dro = driver.findElement(By.xpath("//select[@id='acc6']"));
		dro.click();
		Select select = new Select (dro);
		select.selectByVisibleText("Partner");
		WebElement drp = driver.findElement(By.xpath("//select[@id='acc7']"));
		drp.click();
		Select select1 = new Select (drp);
		select1.selectByVisibleText("Technology");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[3]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")).click();
		
		
		
	}

}
