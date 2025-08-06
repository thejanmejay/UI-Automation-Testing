# 🧪 Selenium Automation Project

This project is designed to help beginners get started with Selenium WebDriver and basic web automation using **Java** or **Python** in **IntelliJ**, **Eclipse**, or **PyCharm**.

---

## 📚 Table of Contents

* [Project Highlights](#-project-highlights)
* [Prerequisites](#-prerequisites)
* [Setup Instructions](#-setup-instructions)

  * [Java + IntelliJ or Eclipse](#java--intellij-or-eclipse)
  * [Python + PyCharm](#python--pycharm)
* [Core Features Demonstrated](#-core-features-demonstrated)

  * [WebDriver Commands](#️-webdriver-commands)
  * [Locator Strategies](#️-locator-strategies)
* [Sample Test Flow](#-sample-test-flow)
* [Project Structure](#-project-structure)
* [Demo Sites](#-demo-sites)
* [License](#-license)

---

## ✅ Project Highlights

* Set up **Selenium WebDriver** with your preferred IDE.
* Master core WebDriver commands: `click()`, `sendKeys()`, `getText()`.
* Learn locator strategies: **ID**, **CSS Selector**, **XPath**.
* Automate a basic **login workflow**.
* Validate the **page title** after login on a demo site.

---

## 🛠 Prerequisites

* **Java SDK** (if using Java) or **Python** (if using Python)
* IDE:

  * [IntelliJ IDEA](https://www.jetbrains.com/idea/) or [Eclipse](https://www.eclipse.org/) for Java
  * [PyCharm](https://www.jetbrains.com/pycharm/) for Python
* **Selenium WebDriver**
* Web browser (e.g., **Chrome**, **Firefox**)
* WebDriver binary (e.g., `chromedriver`, `geckodriver`) in your system `PATH`

---

## 📦 Setup Instructions

### Java + IntelliJ or Eclipse

1. Create a new Maven or Gradle project.

2. Add the Selenium dependency:

   **Maven:**

   ```xml
   <dependency>
     <groupId>org.seleniumhq.selenium</groupId>
     <artifactId>selenium-java</artifactId>
     <version>4.20.0</version>
   </dependency>
   ```

3. Add the WebDriver binary to your system `PATH` or configure it programmatically.

4. Implement test classes using WebDriver commands.

### Python + PyCharm

1. Set up a virtual environment:

   ```bash
   python -m venv venv
   source venv/bin/activate  # or venv\Scripts\activate on Windows
   ```

2. Install Selenium:

   ```bash
   pip install selenium
   ```

3. Place the WebDriver binary in your `PATH` or specify its location in your script.

---

## 🔑 Core Features Demonstrated

### ✔️ WebDriver Commands

```python
driver.get("https://example.com")
driver.find_element(By.ID, "username").send_keys("your_username")
driver.find_element(By.ID, "password").send_keys("your_password")
driver.find_element(By.ID, "loginBtn").click()
assert "Expected Title" in driver.title
```

### ✔️ Locator Strategies

* **By ID**

  ```python
  driver.find_element(By.ID, "username")
  ```

* **By CSS Selector**

  ```python
  driver.find_element(By.CSS_SELECTOR, "input[name='username']")
  ```

* **By XPath**

  ```python
  driver.find_element(By.XPATH, "//input[@name='username']")
  ```

---

## 🧪 Sample Test Flow

1. Launch the browser and navigate to the login page.
2. Enter valid credentials.
3. Click the login button.
4. Validate the title of the landing page.
5. Close the browser.

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

## 🔗 Demo Sites

You can test your automation on the following public demo sites:

* [The Internet (Herokuapp)](https://the-internet.herokuapp.com/login)
* [Guru99 Login Demo](https://demo.guru99.com/test/login.html)

---

## 📄 License

This project is open-source and free to use for educational purposes.
