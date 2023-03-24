package com.CoreJava;

import java.sql.DriverManager;
import java.sql.Time;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithOutUsingSelectFunction {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		
		List<WebElement> element2 =driver.findElements(By.name("Country"));
		System.out.println(element2.size());
		for (WebElement webElement : element2) {
			if("India".equals(webElement.getText()))
				webElement.click();
			break;
		}
		
		
		
		}
//		WebElement button=	driver.findElement(By.xpath("//button[text()='No thanks']"));
//		button.click();
		
		

//		WebElement element=driver.findElement(By.id("input"));
//		element.sendKeys("india");
//		element.click();

	

}
