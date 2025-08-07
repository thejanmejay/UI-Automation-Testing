package com.Main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import com.TestModule.TextBoxTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MainTest {
    public static void main(String[] args) {
        // Configure WebDriverManager
        WebDriverManager.chromedriver().setup();
        
        // Set Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        
        // Initialize WebDriver
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        
        try {
            driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
            driver.get("https://demoqa.com/");

            System.out.println("Page Title: " + driver.getTitle());
            
            // Click on Elements
            WebElement element = driver.findElement(By.xpath(
                "//div[contains(@class,'category-cards')]//div[contains(.,'Elements')]"));
            element.click();
            System.out.println("Current URL: " + driver.getCurrentUrl());
            
            // Click on Text Box
            WebElement textBox = driver.findElement(By.xpath(
                "//li[span[text()='Text Box']]"));
            textBox.click();
            
            // Execute TextBoxTest
            TextBoxTest textBoxTest = new TextBoxTest(driver);
            textBoxTest.performTextBoxTest();
        } catch (Exception e) {
            System.err.println("Error in main test:");
            e.printStackTrace();
        } 
    }
}
