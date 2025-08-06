## 🧪 Selenium Automation Project

This project is designed to help beginners get started with Selenium WebDriver and basic web automation using Java or Python in IntelliJ, Eclipse, or PyCharm.

### ✅ Project Highlights

* Set up **Selenium WebDriver** with a chosen IDE (IntelliJ, Eclipse, or PyCharm)
* Master core WebDriver commands: `click()`, `sendKeys()`, `getText()`
* Learn to use locators: `ID`, `CSS Selector`, `XPath`
* Automate a basic **login workflow**
* Validate page **title** after login on a demo site

---

## 🛠 Prerequisites

* Java SDK (if using Java) or Python (if using Python)
* Installed IDE:

  * [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/) for Java
  * [PyCharm](https://www.jetbrains.com/pycharm/) for Python
* Selenium WebDriver
* Web browser (Chrome/Firefox)
* WebDriver binary (e.g., `chromedriver`, `geckodriver`)

---

## 📦 Setup Instructions

### Java + IntelliJ or Eclipse

1. Create a new Maven/Gradle project.

2. Add Selenium dependency in `pom.xml` or `build.gradle`:

   ```xml
   <!-- For Maven -->
   <dependency>
     <groupId>org.seleniumhq.selenium</groupId>
     <artifactId>selenium-java</artifactId>
     <version>4.20.0</version>
   </dependency>
   ```

3. Download and configure the correct WebDriver binary in your system PATH or project.

4. Write your test class using core WebDriver commands.

### Python + PyCharm

1. Create a new virtual environment.

2. Install Selenium:

   ```bash
   pip install selenium
   ```

3. Download the WebDriver binary (e.g., `chromedriver.exe`) and add it to your PATH or reference it in your script.

---

## 🔑 Core Features Demonstrated

### ✔️ WebDriver Commands

* `driver.get("https://example.com")`
* `driver.find_element(By.ID, "username").send_keys("your_username")`
* `driver.find_element(By.ID, "password").send_keys("your_password")`
* `driver.find_element(By.ID, "loginBtn").click()`
* `driver.title` or `driver.getTitle()` for page title validation

### ✔️ Locator Strategies

* By **ID**
  `driver.find_element(By.ID, "username")`
* By **CSS Selector**
  `driver.find_element(By.CSS_SELECTOR, "input[name='username']")`
* By **XPath**
  `driver.find_element(By.XPATH, "//input[@name='username']")`

---

## 🧪 Sample Test Flow

1. Launch browser and navigate to demo login page.
2. Enter valid credentials.
3. Click login button.
4. Assert that the post-login page title is as expected.
5. Close browser.

---

## 📂 Project Structure

```
selenium-login-test/
├── drivers/                  # WebDriver binaries (e.g., chromedriver)
├── src/
│   └── LoginTest.java        # or login_test.py
├── pom.xml / requirements.txt
└── README.md
```

---

## 🔗 Demo Sites (Examples)

* [https://the-internet.herokuapp.com/login](https://the-internet.herokuapp.com/login)
* \[[https://demo.guru99.com/test/login.html\](](https://demo.guru99.com/test/login.html]%28)[https://demo.guru99](https://demo.guru99)
