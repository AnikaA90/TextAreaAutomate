package com.itera.Automate;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws AWTException  {
		// TODO Auto-generated method stub
		
	WebDriver driver = WebDriverManager.chromedriver().avoidShutdownHook().create();
	
	driver.get("https://itera-qa.azurewebsites.net/home/automation");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement element = driver.findElement(By.xpath("//*[@id=\"inputGroupFile02\"]"));
	Actions actions = new Actions(driver);
	actions.scrollToElement(element).click(element).perform();
	
	Robot robot = new Robot();
	robot.delay(2000);
	
	StringSelection ss = new StringSelection("C:\\Users\\grn_a\\Pictures\\Money.png");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.delay(2000);
	
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	robot.delay(2000);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	driver.close();
	driver.quit();
	
	
	
	
	

	}

}
