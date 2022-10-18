package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T1 {
@Test

	public void Tc003() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	
	String window1=driver.getWindowHandle();
	System.out.println(window1);
	//driver.switchTo().window(window1);

	Set<String> both_address=driver.getWindowHandles();
	System.out.println(both_address);
	int count=both_address.size();
	System.out.println(count);
	//driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("nikhil");
	
	
	
}
}