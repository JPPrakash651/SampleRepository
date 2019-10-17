package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeDepot 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYPEE\\eclipse-workspace\\org.sample\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver .get("https://www.homedepot.com");
		Thread.sleep(5000);
		WebElement lnkAllDepart=driver.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(lnkAllDepart).perform();
		
		WebElement lnkHeatandCooling=driver.findElement(By.xpath("(//a[@title='Heating & Cooling'])[1]"));
		a.moveToElement(lnkHeatandCooling).perform();
		
		WebElement lnkAirConditiner=driver.findElement(By.xpath("//a[@title='Air Conditioners']"));
		a.moveToElement(lnkAirConditiner).perform();
		
		WebElement lnkPortable=driver.findElement(By.xpath("//a[@title='Portable Air Conditioners']"));
		lnkPortable.click();

	}

}
