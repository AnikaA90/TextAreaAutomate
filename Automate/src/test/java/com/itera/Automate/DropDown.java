package com.itera.Automate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\grn_a\\Downloads\\chromedriver_win32(5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement dropDown = driver.findElement(By.className("custom-select"));
		Select selectDropDown = new Select(dropDown);
		
		selectDropDown.selectByIndex(1);
		selectDropDown.selectByValue("2");
		selectDropDown.selectByVisibleText("Turkey");
		
		System.out.println("Selection From Dropdown Complete");
		
		driver.close();
		driver.quit();
		
		
		
		
		
		
	}

}
