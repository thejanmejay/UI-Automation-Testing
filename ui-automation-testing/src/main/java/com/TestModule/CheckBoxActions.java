package com.TestModule;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class CheckBoxActions {
	WebDriver driver;
	WebDriverWait wait;

	public CheckBoxActions(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void clickCheckboxSection() {
		driver.findElement(By.id("item-1")).click();
		System.out.println("Clicked on CheckBox section.");
		System.out.println("User redirected to: " + driver.getCurrentUrl());
	}

	public void clickHomeCheckbox() {
		WebElement homeCheckbox = wait.until(ExpectedConditions.elementToBeClickable(By.id("tree-node-home")));
		homeCheckbox.click();
		System.out.println("Home checkbox clicked.");
	}

	public void expandAll() {
		WebElement expandAll = driver.findElement(By.xpath("//button[@title='Expand all']"));
		expandAll.click();
		System.out.println("Expand All clicked.");
	}

	public void selectChildCheckboxes() {
		WebElement desktop = driver.findElement(By.id("tree-node-desktop"));
		if (!desktop.isSelected())
			desktop.click();

		WebElement documents = driver.findElement(By.id("tree-node-documents"));
		if (!documents.isSelected())
			documents.click();

		WebElement downloads = driver.findElement(By.id("tree-node-downloads"));
		if (!downloads.isSelected())
			downloads.click();

		System.out.println("Child checkboxes selected.");
	}

	public void expandDocumentAndDownload() {
		WebElement docToggle = driver
				.findElement(By.xpath("//label[@for='tree-node-documents']/preceding-sibling::button"));
		docToggle.click();
		WebElement downToggle = driver
				.findElement(By.xpath("//label[@for='tree-node-downloads']/preceding-sibling::button"));
		downToggle.click();
		System.out.println("Expanded documents and downloads sections.");
	}

	public void selectGrandchildCheckboxes() {
		WebElement workspace = driver.findElement(By.id("tree-node-workspace"));
		if (!workspace.isSelected())
			workspace.click();

		WebElement office = driver.findElement(By.id("tree-node-office"));
		if (!office.isSelected())
			office.click();

		WebElement wordFile = driver.findElement(By.id("tree-node-wordFile"));
		if (!wordFile.isSelected())
			wordFile.click();

		WebElement excelFile = driver.findElement(By.id("tree-node-excelFile"));
		if (!excelFile.isSelected())
			excelFile.click();

		System.out.println("Grandchild checkboxes selected.");
	}

	public void collapseAll() {
		WebElement collapseAll = driver.findElement(By.xpath("//button[@title='Collapse all']"));
		collapseAll.click();
		System.out.println("Collapse All clicked.");
	}

	public void performCheckBoxTest() {
		try {
			clickCheckboxSection();
			clickHomeCheckbox();
			expandAll();
			selectChildCheckboxes();
			expandDocumentAndDownload();
			selectGrandchildCheckboxes();
			collapseAll();
		} catch (Exception e) {
			System.err.println("Error during CheckBox test execution:");
			e.printStackTrace();
		}
	}
}