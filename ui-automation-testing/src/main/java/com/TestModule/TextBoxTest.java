package com.TestModule;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxTest {
	  WebDriver driver;
    public TextBoxTest(WebDriver driver) {
    	this.driver= driver;
    	}
    public void performTextBoxTest() {
		// Assuming driver is already initialized and points to the correct page
		if (driver == null) {
			System.err.println("WebDriver is not initialized.");
			return;
		}
    			try {
            // Use the passed driver, don't create a new one
// wait till the page load 
    				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
            System.out.println("User is on the Text Box page: " + driver.getCurrentUrl());
            
            WebElement fullName = driver.findElement(By.id("userName"));
            WebElement email = driver.findElement(By.id("userEmail"));
            WebElement currentAddress = driver.findElement(By.id("currentAddress"));
            WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
            WebElement submitButton = driver.findElement(By.id("submit"));
            
            fullName.sendKeys("John Doe");
            email.sendKeys("test@gmail.com");
            currentAddress.sendKeys("123 Main St, Springfield, USA");
            permanentAddress.sendKeys("456 Elm St, Springfield, USA");
            submitButton.click();
            
            System.out.println("Form submitted successfully.");
            
        } catch(Exception e) {
            System.err.println("Error in TextBoxTest:");
            e.printStackTrace();
        }
    }
}