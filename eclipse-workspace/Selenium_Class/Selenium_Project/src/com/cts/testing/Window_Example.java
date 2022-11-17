package com.cts.testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Test\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		/*String title=driver.getTitle();
		System.out.println("The title is:"+title);
		String parent = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		Iterator<String> i = s.iterator();
		while (i.hasNext()) {
			String child = i.next();
			if (!parent.equals(child)) {
				driver.switchTo().window(child);
				System.out.println(driver.switchTo().window(child).getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parent);
	}
}*/
		driver.findElement(By.id("windowButton")).click();
		WebElement textname=driver.findElement(By.id("sampleHeading"));
	}
}
		
