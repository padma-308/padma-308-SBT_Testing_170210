package com.deloitte.assessment;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Checktheshoppingcart {
	//public static String fileWitPath;
	public static void main(String[] args) throws InterruptedException , IOException{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		//DesiredCapabilities capabilities =DesiredCapabilities
		WebDriver driver= new ChromeDriver();
		//driver.get("https://www.amazon.in/gp/huc/view.html?ie=UTF8&newItems=C772ab494-b335-4b86-b471-da0ad4a098cf%2C1");
 //WebElement linktext = driver.findElement(By.xpath("/html/body"));
//linktext.click();
		driver.get("");
		WebElement linktext = driver.findElement(By.xpath("/html/body"));
		linktext.click();
		

 }
	}

