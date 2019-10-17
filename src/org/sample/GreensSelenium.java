package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensSelenium 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYPEE\\eclipse-workspace\\org.sample\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver .get("http://www.greenstechnologys.com/");
		WebElement lnkCourses=driver.findElement(By.xpath("//a[text()='COURSES']"));
		Actions a=new Actions(driver);
		a.moveToElement(lnkCourses).perform();
		
		WebElement lnkSoftwareTraing = driver.findElement(By.xpath("(//span[text()='Software Testing Training'])[1]"));
		a.moveToElement(lnkSoftwareTraing).perform();
		
		WebElement lnkSelenium = driver.findElement(By.xpath("//span[text()='Selenium']"));
		lnkSelenium.click();
		
		/*WebElement btnPopupClose=driver.findElement(By.xpath("//button[@type='button']"));
		btnPopupClose.click();*/
		
		WebElement txt3Para=driver.findElement(By.xpath("//div[@id='article-wrapper']/p[3]"));
		String para=txt3Para.getText();
		System.out.println(para);
		
		
	}


}
