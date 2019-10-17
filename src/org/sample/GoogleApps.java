package org.sample;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleApps 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYPEE\\eclipse-workspace\\org.sample\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement btnApps=driver.findElement(By.xpath("//a[@title='Google apps']"));
		btnApps.click();
		
		WebElement lnkGmail=driver.findElement(By.xpath("//span[text()='Gmail']"));
		Actions a=new Actions(driver);
		a.moveToElement(lnkGmail).click();
		
		
	}

}
