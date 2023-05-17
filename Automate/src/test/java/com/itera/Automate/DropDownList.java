package com.itera.Automate;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\grn_a\\Downloads\\chromedriver_win32(5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement dropDown = driver.findElement(By.className("custom-select"));
		Select selectList = new Select(dropDown);
		
		List <WebElement> allAvailableOptions = selectList.getOptions();
		for(WebElement option : allAvailableOptions) {
			System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("Norway"))option.click();
			
		}
		
		System.out.println("Selection From Dropdown Complete");
		
		driver.close();
		driver.quit();
		
	}

}
