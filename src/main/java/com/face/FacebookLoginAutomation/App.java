package com.face.FacebookLoginAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Open Facebook
        driver.get("https://www.facebook.com");

        // Find the username and password fields and login button
        WebElement emailInput = driver.findElement(By.id("email"));
        WebElement passwordInput = driver.findElement(By.id("pass"));
 

        // Enter your Facebook username and password
        emailInput.sendKeys("abcd564756@gmail.com");
        passwordInput.sendKeys("your_password");

       

    }
}
