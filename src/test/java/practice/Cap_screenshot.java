package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Cap_screenshot {
@Test
public void tc001() throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://mvnrepository.com/");
	driver.manage().window().maximize();
	
	String path="C:\\Users\\ADMIN\\eclipse-workspace\\AUTOMATION_PRACTICE\\Screenshot1";
	String name=RandomString.make(4);
	
	TakesScreenshot ts=(TakesScreenshot)driver; //typecast
	
	File surce=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File(path+"\\"+name+".png");
	FileUtils.copyFile(surce, destination);
	
	driver.quit();
	
}
}
