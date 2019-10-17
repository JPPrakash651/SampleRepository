package org.sample;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Screenshot 
{
	public static void main(String[] args) throws IOException  
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\JAYPEE\\eclipse-workspace\\org.sample\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot tk=(TakesScreenshot) driver;
		File f= tk.getScreenshotAs(OutputType.FILE);
		System.out.println(f);
		
		File dest=new File("C:\\Desktop\\screenshot5784053072654268386.jps");
		FileUtils.copyFile(f,dest);
		
	}
}