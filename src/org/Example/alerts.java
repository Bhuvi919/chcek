package org.Example;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class alerts {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\M\\eclipse-workspace\\automation\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.redbus.in/?gclid=EAIaIQobChMI55SPgZXS4gIVVg4rCh2oXwHkEAAYASAAEgJBWPD_BwE");
	driver.findElement(By.xpath("//*[@id=\"rh_header\"]/div/div/div[2]/div[3]/div/a")).click();
	String p = driver.getWindowHandle();
	Set<String> c = driver.getWindowHandles();
	Thread.sleep(16000);
	driver.findElement(By.xpath("//i[@class='icon-close']")).click();
	for(String v : c) {
		if((!p.equals(v))){
			driver.switchTo().window(v);
		}
	}
	
	}

}
