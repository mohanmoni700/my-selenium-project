package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MySeleniumTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        // Set up the ChromeDriver path
	System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        // Configure ChromeOptions (optional)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run browser in headless mode

        // Initialize ChromeDriver
        driver = new ChromeDriver(options);
    }

    @Test
    public void testGoogle() {
        // Navigate to Google
        driver.get("https://www.google.com");

        // Assert the title contains "Google"
        String title = driver.getTitle();
        assert title.contains("Google");
    }

    @After
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
