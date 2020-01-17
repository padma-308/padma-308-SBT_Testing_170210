package com.deloitte.assessment;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Kitchensearch {
	//public static String fileWitPath;
	public static void main(String[] args) throws InterruptedException , IOException{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		//DesiredCapabilities capabilities =DesiredCapabilities
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/Non-Stick-Aluminium-Cookware-4-Pieces-26_KD12_KD13_CH_RT/dp/B07B2TQ6BB/ref=sr_1_3_sspa?keywords=kitchen+items&qid=1579257389&sr=8-3-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyT0I3RjBHSk4zMU44JmVuY3J5cHRlZElkPUEwNzQyOTc1MVc1OVMzT1JWVzNCMCZlbmNyeXB0ZWRBZElkPUEwOTE1NjkzMVBERlVYQlo5SVMyJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==");
 driver.findElement(By.xpath("/html/body/div[2]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input")).sendKeys("Nirlon Non-Toxic Pfoa Free Aluminium Combo Kitchen Item Gift Set");

 }
	}
