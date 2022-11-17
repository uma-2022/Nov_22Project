package com.cts.testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_First {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "F:\\Test\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.browserstack.com/");
	driver.findElement(By.id("windowButton")).click();
	WebElement textname=driver.findElement(By.id("sampleHeading"));
	System.out.println("Element found using text: " + textname.getText());
	driver.close();
	}
}
