package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class P1 {

@Test	
public void tc001() throws Exception {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://mvnrepository.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='query']")).sendKeys("selenium");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	}
}
