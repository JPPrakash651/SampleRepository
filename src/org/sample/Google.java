package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYPEE\\eclipse-workspace\\org.sample\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement txtSearchBox=driver.findElement(By.name("q"));
		txtSearchBox.sendKeys("GreensTechnology");
		WebElement btnSearch=driver.findElement(By.xpath("(//input[@value='Google Search'])[2]"));
		btnSearch.click();
		
	}

}
