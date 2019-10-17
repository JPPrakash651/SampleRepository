package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYPEE\\eclipse-workspace\\org.sample\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtName=driver.findElement(By.xpath("//input[@id='email']"));
		txtName.sendKeys("test");
		WebElement txtPassword=driver.findElement(By.xpath("//input[@id='pass']"));
		txtPassword.sendKeys("test123");
		WebElement btnLogin=driver.findElement(By.xpath("//input[@id='u_0_b']"));
		btnLogin.click();
				
	}
	
}
