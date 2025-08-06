package TestModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBoxTest {

	public void TextBox(WebDriver driver2) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		
		// Navigate to the text box page
		System.out.println("User is on the Text Box page." + driver.getCurrentUrl());
		
		try {
			WebElement fullName = driver.findElement(By.id("userName"));
			WebElement email = driver.findElement(By.id("userEmail"));
			WebElement currentAddress = driver.findElement(By.id("currentAddress"));
			WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
			WebElement submitButton = driver.findElement(By.id("submit"));
			
			// Iput Fill in the text box fields
			fullName.sendKeys("John Doe");
			email.sendKeys("test@gmail.com");
			currentAddress.sendKeys("123 Main St, Springfield, USA");
			permanentAddress.sendKeys("456 Elm St, Springfield, USA");
			submitButton.click();
			System.out.println("User has filled in the text box fields and submitted the form.");
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			// Close the browser
			// driver.quit();
		}
		
	}

}
