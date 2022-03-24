package seleniumCode;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\Parivartan Academy\\Downloads for selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
			
		driver.findElement(By.id("email")).sendKeys("hvadaud");
		driver.findElement(By.id("pass")).sendKeys("abcdefg");
		
		driver.findElement(By.xpath("//button[@data-testid=\"royal_login_button\" ]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(5000);
		
		//This is random line
		
		TakesScreenshot Scr=(TakesScreenshot) driver;
		File ScrFile=Scr.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScrFile, new File(System.getProperty("user.dir")+"\\s2.png"));
	}

}
