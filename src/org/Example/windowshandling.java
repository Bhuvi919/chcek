package org.Example;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M\\eclipse-workspace\\automation\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Window.html");
		String oldwindow = driver.getWindowHandle();
		driver.findElement(By.id("home")).click();
		
		Set<String> handles = driver.getWindowHandles();
		for(String newWindow : handles) {
		driver.switchTo().window(newWindow);
		}
		driver.findElement(By.xpath("//a[@class='wp-categories-link maxheight']")).click();
		driver.close();
		driver.switchTo().window(oldwindow);
		driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("home")).click();
		int i = driver.getWindowHandles().size();
		System.out.println("The total brower is  "+ i);
		
		
		
	}

}
