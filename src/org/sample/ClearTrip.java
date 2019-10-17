package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYPEE\\eclipse-workspace\\org.sample\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		WebElement lnkFrom=driver.findElement(By.xpath("//input[@id='from_station']"));
		lnkFrom.sendKeys("Chennai");
		WebElement lnkTo=driver.findElement(By.xpath("//input[@id='to_station']"));
		lnkTo.sendKeys("Coimbatore");
		WebElement drpdnClass=driver.findElement(By.xpath("//select[@id='trainClass']"));
		drpdnClass.sendKeys("1A");
		WebElement txtDate=driver.findElement(By.xpath("//input[@id='dpt_date']"));
		txtDate.sendKeys("10/10/2019");
		WebElement drpdnAdults=driver.findElement(By.xpath("//select[@id='train_adults' ]"));
		drpdnAdults.sendKeys("2");
		WebElement drpdnChild=driver.findElement(By.xpath("//select[@id='train_children']"));
		drpdnChild.sendKeys("5");
		WebElement drpdnMaleSeniors=driver.findElement(By.xpath("//select[@id='train_male_seniors']"));
		drpdnMaleSeniors.sendKeys("4");
		WebElement drpdnFemaleSeniors=driver.findElement(By.xpath("//select[@name='female_seniors']"));
		drpdnFemaleSeniors.sendKeys("3");
		WebElement btnSearch=driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		btnSearch.click();
	}
}
