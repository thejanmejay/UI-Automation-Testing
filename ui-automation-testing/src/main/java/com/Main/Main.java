package com.Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import TestModule.TextBoxTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Main {

	public static void main(String[] args) {
		// Set up ChromeDriver using WebDriverManager
		WebDriverManager.chromedriver().setup();

		// Use WebDriver as the type (recommended)
		WebDriver driver = new ChromeDriver();
		// wait 10 seconds for elements to be present
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		// Navigate to a URL
		driver.get("https://demoqa.com/");

		// Print the page title
		System.out.println("Page Title: " + driver.getTitle());
		
		// click on the "Elements" link
		WebElement element = driver.findElement(By.xpath(
				"//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[1]/div[1]"));
		element.click();

		// Print the current URL
		System.out.println("Current URL: " + driver.getCurrentUrl());
		System.out.println("User redirected to the Elements page.");
		
		WebElement textBox = driver.findElement(By.xpath(
				"//div[@class='element-list collapse show']/ul/li[1]/span[@class='text']"));
		textBox.click();
		System.out.println("User redirected to the Text Box page.");
		
		TextBoxTest textBoxPage = new TextBoxTest();
		textBoxPage.TextBox(driver);
		// Close the browser
		// driver.quit();
	}
}
