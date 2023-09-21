Copy code
# Facebook Login Automation with Selenium and Maven

## Overview

This Maven project automates the Facebook.com login flow using Selenium WebDriver. It includes steps to check the browser version, download the appropriate ChromeDriver, write a test automation application, export it as a runnable JAR, push it to a GitHub repository, and run the automation application.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [1. Check Browser Version](#1-check-browser-version)
  - [2. Write the Automation Application](#2-write-the-automation-application)
  - [3. Export as Runnable JAR](#3-export-as-runnable-jar)
  - [4. Push to GitHub](#4-push-to-github)
  - [5. Run the Automation Application](#5-run-the-automation-application)

## Prerequisites

Before you can use this automation project, make sure you have the following prerequisites installed:

- [Java](https://www.oracle.com/java/)
- [Maven](https://maven.apache.org/)
- [Selenium WebDriver](https://www.selenium.dev/)
- [Google Chrome](https://www.google.com/chrome/)
- [Git](https://git-scm.com/)

## Getting Started

Follow the steps below to set up and use the Facebook login automation script with Maven:

### 1. Check Browser Version

To ensure compatibility, check your Google Chrome browser version:

1. Open Google Chrome.
2. Click on the three dots in the upper-right corner.
3. Go to **Help** > **About Google Chrome**.
4. Note down the Chrome version (e.g., 93.0.4577.63).

### 2. Write the Automation Application

1. Create a new Maven project in your preferred IDE (e.g., IntelliJ IDEA or Eclipse) or using the command line.
2. Add Selenium WebDriver and Maven dependencies to your project.
3. Write the Facebook login automation code using Selenium. You can refer to the sample code provided in the project files.

### 3. Export as Runnable JAR

1. Export your automation application as a runnable JAR file:
   - Right-click on your project.
   - Select **Export**.
   - Choose **Runnable JAR file** as the export type.
   - Select your project and the main class with the `main` method.
   - Choose a destination for the JAR file and click **Finish**.

### 4. Push to GitHub

1. Create a new GitHub repository for your project.
2. Initialize a Git repository in your local project folder if not already done.
3. Add, commit, and push your project files, including the runnable JAR, to your GitHub repository.

### 5. Run the Automation Application

1. Clone your GitHub repository to a local directory.
2. Download the appropriate ChromeDriver version based on your browser version.
3. Place the ChromeDriver executable in the project directory.
4. Open a terminal, navigate to the project directory, and run the automation application:

