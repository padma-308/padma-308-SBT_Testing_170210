package com.deloitte.assessment;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Grocerysearch {
	//public static String fileWitPath;
	public static void main(String[] args) throws InterruptedException , IOException{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		//DesiredCapabilities capabilities =DesiredCapabilities
		WebDriver driver= new ChromeDriver();
		driver.get("ccc");
 driver.findElement(By.xpath("/html/body")).sendKeys("Vim Dishwash Gel");

 }
	}
