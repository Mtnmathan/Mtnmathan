package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestngTut {
	public static void goooglesearch() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Mails");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		driver.close();
	}
	
	public static void main(String[] args) {
		goooglesearch();
	}

}
