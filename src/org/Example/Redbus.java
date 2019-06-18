package org.Example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\M\\eclipse-workspace\\automation\\driver\\geckodriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='sign-in-icon-down']")).click();
		driver.findElement(By.xpath("//li[@id='signInLink']")).click();
		driver.findElement(By.xpath("//div[@class='mobileInputContainer clearfix']")).click();
		driver.findElement(By.xpath("//*[@id=\"signInView\"]/div[2]/div/div[3]/div[5]")).click();
	}

}
