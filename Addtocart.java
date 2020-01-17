package com.deloitte.assessment;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Addtocart {
	//public static String fileWitPath;
	public static void main(String[] args) throws InterruptedException , IOException{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		//DesiredCapabilities capabilities =DesiredCapabilities
		WebDriver driver= new ChromeDriver();

		//driver.get("https://www.amazon.in/SENDEM-Adapter-Projector-Monitor-Compatible/dp/B083D3VHZW/ref=sr_1_2_sspa?keywords=mobile+phones&qid=1579259454&s=electronics&sr=1-2-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyTzA3Mk5IRVZZRUM1JmVuY3J5cHRlZElkPUEwNTMzMTc2UklSRjc5NEhORkpCJmVuY3J5cHRlZEFkSWQ9QTAzODAyNDMxNjRCMVZJWlBENDc0JndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==");
		// WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/div[5]/div[1]/div[3]/div/div/div/form/div/div/div/div/div[2]/div/div[27]/div[1]/span/span/span/input"));
		//button.click();

		//driver.get("https://www.amazon.in/Navy-Sport-Solid-Ankle-Length/dp/B073WX582T/ref=sr_1_1?dchild=1&keywords=apparel&qid=1579257909&sr=8-1");
		 //WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/form/div/div/div/div/div[2]/div/div[27]/div[1]/span/span/span/input"));
		//button.click();
		
		//driver.get("https://www.amazon.in/Vim-Dishwash-Gel-750-Lemon/dp/B0711SD5RP/ref=sr_1_9?crid=39WTILFP0R9Y5&keywords=grocery+items&qid=1579257026&s=pantry&sprefix=grocery+items%2Caps%2C605&sr=8-9");
		 //WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/div[8]/div/div/div/div/form/div[1]/div/div[2]/div/span/span/input"));
		//button.click();
		
		driver.get("https://www.amazon.in/Non-Stick-Aluminium-Cookware-4-Pieces-26_KD12_KD13_CH_RT/dp/B07B2TQ6BB/ref=sr_1_3_sspa?keywords=kitchen+items&qid=1579257389&sr=8-3-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyT0I3RjBHSk4zMU44JmVuY3J5cHRlZElkPUEwNzQyOTc1MVc1OVMzT1JWVzNCMCZlbmNyeXB0ZWRBZElkPUEwOTE1NjkzMVBERlVYQlo5SVMyJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==");
		 WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/div[5]/div[1]/div[3]/div/div/div/form/div/div/div/div/div[2]/div/div[27]/div[1]/span/span/span/input"));
		button.click();
 }
	}
