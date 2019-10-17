package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\JAYPEE\\eclipse-workspace\\org.sample\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement lnkContact=driver.findElement(By.xpath("//a[@href='contact.php']"));
		lnkContact.click();
		WebElement txtName=driver.findElement(By.xpath("//input[@id='InputName']"));
		txtName.sendKeys("Jai");
		WebElement txtEmail=driver.findElement(By.xpath("//input[@id='InputEmail1']"));
		txtEmail.sendKeys("testmail@gmail.com");
		WebElement txtMobile=driver.findElement(By.xpath("//input[@id='InputSubject']"));
		txtMobile.sendKeys("9095551123");
		WebElement txtCourse=driver.findElement(By.xpath("(//select[@name='courses'])[1]"));
		txtCourse.sendKeys("Selenium");
		WebElement txtBranch=driver.findElement(By.xpath("(//select[@name='branch'])[1]"));
		txtBranch.sendKeys("OMR");
		WebElement txtTime=driver.findElement(By.xpath("(//select[@name='time'])[1]"));
		txtTime.sendKeys("08:30");
		WebElement txtMessage=driver.findElement(By.xpath("//textarea[@placeholder='Message*']"));
		txtMessage.sendKeys("Day 3 task to automate");
		WebElement btnSubmit=driver.findElement(By.xpath("//button[@id='submit']"));
		btnSubmit.click();
		
	}

}
