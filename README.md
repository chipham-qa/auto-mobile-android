# auto-mobile-android

## I. Prerequisites
1. Installation of Nodejs 10+ and Node Package Manager (NPM)
2. Install Java JDK 11
3. Install Maven
4. Install IntelliJ as an IDE, which is the recommended IDE, but you can use any editor or IDE
5. Install Android Studio to create a emulator device
6. Install Appium Desktop from the releases page Link: https://github.com/appium/appium-desktop/releases
7. Install Appium Inspector: https://github.com/appium/appium-inspector

## II. Directory Structure
```
├───src
│   ├───main
│   │   ├───java
│   │   └───resources
│   │       │   env-demo.properties
│   │       │
│   │       └───app
│   │               MyGlobal_apkpure.apk
│   └───test
│       ├───java
│       │   ├───common
│       │   │       MobileAction.java
│       │   │
│       │   ├───helpers
│       │   │       AppDriverManager.java
│       │   │       TestContextSetup.java
│       │   │
│       │   ├───pageObjects
│       │   │       LoginPage.java
│       │   │       PageObjectManager.java
│       │   │
│       │   ├───stepDefinitions
│       │   │       LoginSteps.java
│       │   │
│       │   └───testRunner
│       │           TestRunnerLogin.java
│       │
│       └───resources
│           │   extent.properties
│           │
│           └───features
│                   Login.feature
└───test-output
    └───ExtentReport Aug-5-23 21-26
        └───CucumberExtentReports
                report.html
```

## III. How To Use
1. Create a emulator device via Android Studio
2. Start Server via Appium Desktop
3. Depend your device create on the step 1. Get some infomation below. Config [env-demo.properties](src/main/resources/env-demo.properties)
- Run command adb devices to see the name of the device
- Check Android version to put correct value to platformVersion
4. Run
- You can run Feature file (src/test/resources/features/)
- You can run Cucumber TestRunner from (src\test\java\testRunner)
5. Extent Report
- Config from src/test/resources/extent.properties
