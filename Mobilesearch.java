package com.deloitte.assessment;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Mobilesearch {
	//public static String fileWitPath;
	public static void main(String[] args) throws InterruptedException , IOException{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		//DesiredCapabilities capabilities =DesiredCapabilities
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/Redmi-Note-Neptune-Blue-Storage/dp/B07X1KT6LD/ref=sr_1_3?keywords=mobile+phones&qid=1579258687&smid=A23AODI1X2CEAE&sr=8-3");
 driver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input")).sendKeys("Redmi Note 8 (Neptune Blue, 4GB RAM, 64GB Storage)");

 }
	}


