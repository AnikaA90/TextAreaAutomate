package com.itera.Automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\grn_a\\Downloads\\chromedriver_win32(5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("name")).sendKeys("John Doe");
		driver.findElement(By.id("phone")).sendKeys("978-256-9090");
		driver.findElement(By.id("email")).sendKeys("johndoe@email.com");
		driver.findElement(By.id("password")).sendKeys("89sdU&K");
		driver.findElement(By.id("address")).sendKeys("6700 Brooklyn Street, Albany, New York");
		driver.findElement(By.name("submit")).click();
		
		
		
		driver.close();
		driver.quit();
		
	}

}
