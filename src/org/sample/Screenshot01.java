package org.sample;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot01 
{
	public void main() throws Exception 
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
