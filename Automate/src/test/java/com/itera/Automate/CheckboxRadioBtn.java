package com.itera.Automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckboxRadioBtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\grn_a\\Downloads\\chromedriver_win32(5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement element = driver.findElement(By.id("female"));
		Actions actions = new Actions(driver);
		actions.scrollToElement(element).click(element).perform();		
		driver.findElement(By.id("tuesday")).click();
		driver.findElement(By.id("thursday")).click();
		
		driver.close();
		driver.quit();
		
		
		

	}

}
