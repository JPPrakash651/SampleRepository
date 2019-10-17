package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LVB 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYPEE\\eclipse-workspace\\org.sample\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.lvbankonline.in/index.html?module=login");
		WebElement txtUserName=driver.findElement(By.id("login_username|input"));
		txtUserName.sendKeys("Test");
		WebElement txtPassword=driver.findElement(By.id("login_password|input"));
		txtPassword.sendKeys("Test");
		WebElement btnLogin=driver.findElement(By.id("ui-id-13"));
		btnLogin.click();
		
	}

}
