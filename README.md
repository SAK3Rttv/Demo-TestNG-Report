# TestNG Reporting & Selenium Automation Project

This project demonstrates automated browser testing using **Selenium WebDriver** and **TestNG**. The primary goal is to showcase the generation and customization of TestNG reports through multiple methods.

## 📊 Test Execution Reports
You can access the generated reports from the latest execution here:
*   **[Method 1: Emailable Report](./reports/emailable-report.html)** - A high-level summary of Pass/Fail status.
*   **[Method 2: Index Report](./reports/index.html)** - Detailed interactive report with execution timings.
*   **Method 3: Reporter Class** - Custom logs are embedded within the Java code and visible inside the reports above.

---

## 🛠️ Assignment Objectives
1. **Create Testcases**: Implemented `DemoA` (Success) and `DemoB` (Failure) to demonstrate different reporting states.
2. **Execution**: Automated Google Search interactions using Chrome Browser.
3. **Report Generation**:
    - Used `Reporter.log()` to provide step-by-step execution details.
    - Configured `testng.xml` to execute the suite and generate standard HTML outputs.

---

## 📁 Project Structure
- **`src/ch4_2/DemoA.java`**: Successful search scenario using correct element locators (`name="q"`).
- **`src/ch4_2/DemoB.java`**: Failing scenario using an incorrect locator (`name="aq"`) to demonstrate error reporting.
- **`reports/`**: Permanent storage for assignment report files.
- **`testng.xml`**: Suite configuration file.
- **`pom.xml`**: Maven dependencies for Selenium 4.x and TestNG 7.x.

---

## 🚀 Getting Started

### Prerequisites
* Java 17 or higher
* Google Chrome Browser
* Eclipse IDE with TestNG and Maven plugins

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/SAK3Rttv/Demo-TestNG-Report.git
   ```
2. Import into Eclipse:
   `File > Import > Maven > Existing Maven Projects`

### Running the Tests
1. Right-click `testng.xml` in the project root.
2. Select **Run As > TestNG Suite**.
3. After execution, refresh the project (F5) to see updated reports in the `test-output` folder.

---

## 📝 Technical Notes
* **Wait Strategy**: The project uses `Implicit/Explicit Waits` to ensure element stability.
* **Cleanup**: The `@AfterMethod` ensures `driver.quit()` is called after every test to prevent memory leaks.
* **Logging**: SLF4J and Java Util Logging are configured to minimize console noise while preserving TestNG reports.
