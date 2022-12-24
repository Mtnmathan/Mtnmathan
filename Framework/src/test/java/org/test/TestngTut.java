package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngTut {
	public static void goooglesearch() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Mails");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		String title = driver.getTitle();
		System.out.println("The title of the page is "+title);
		System.out.println("Pushed from file loc");
		driver.close();
		System.out.println("Git push");
	}
	
	public static void main(String[] args) {
		goooglesearch();
	}

}
