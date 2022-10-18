package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {
@Test
	public void TC002() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://mvnrepository.com/");
	driver.manage().window().maximize();
	
	//step1 create typecast of javascriptexecutor
	
	JavascriptExecutor jvs=(JavascriptExecutor)driver;
  //scroll by pixel
	jvs.executeScript("window.scrollBy(0,500)","");


}
}
