package com.TestModule;

import org.openqa.selenium.WebDriver;

public class CheckBoxTestRunner {
	WebDriver driver;

	public CheckBoxTestRunner(WebDriver driver) {
		this.driver = driver;

	}

	public void performCheckBoxTest() {
		if (driver == null) {
			System.err.println("WebDriver is not initialized.");
			return;
		}

		// Use the passed driver, don't create a new one
		try {

			// Create instance of your logic class
			CheckBoxActions checkboxActions = new CheckBoxActions(driver);

			// Call high-level test steps
			checkboxActions.clickCheckboxSection();
			checkboxActions.clickHomeCheckbox();
			checkboxActions.expandAll();
			checkboxActions.selectChildCheckboxes();
			checkboxActions.expandDocumentAndDownload();
			checkboxActions.selectGrandchildCheckboxes();
			checkboxActions.collapseAll();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}