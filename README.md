<<<<<<< HEAD
# Katalon Sauce Labs Mobile Automation

Automated mobile testing framework built using **Katalon Studio** for the native Android Sauce Labs application.

## 🚀 Project Overview
This repository implements 5 key test cases covering both positive and negative scenarios (Login validation, Product Catalog viewing, Cart interaction, Side Menu navigation, and Session security checks) without relying on Record Mobile functionality.

## 🛠️ Tech Stack
- **Test Engine:** Katalon Studio
- **Language:** Groovy
- **Platform:** Android (Native App)

## 📂 Project Structure
- `Data/APK/`: Contains the target `.apk` file stored locally within the project.
- `Object Repository/`: Divided into `Login-Page` and `Products-Page` UI element mappings.
- `Test Cases/`: Modular test scripts using dynamic pathing (`RunConfiguration.getProjectDir()`).
- `Test Suites/`: `TS_Mobile_Final_Project` for execution grouping.

## ⚙️ How to Run
1. Connect an Android Emulator or a physical device with USB Debugging enabled.
2. Open Katalon Studio and load this project.
3. Open **Test Suites** > `TS_Mobile_Final_Project`.
4. Click **Run** to execute the test suite automatically.

## 📊 Test Coverage & Scenarios
- **Login Flow:** Valid credentials login vs. invalid password / unauthenticated alerts.
- **Catalog View:** Verifying product items visibility after login and blocking unauthenticated access.
- **Interactions:** Testing Cart buttons and Side Menu drawer responsiveness.
=======
# katalon-saucelabs-mobile
>>>>>>> d7f037896193ecc5531fd01467874c648bea2c9b
