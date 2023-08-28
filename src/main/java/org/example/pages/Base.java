package org.example.pages;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {

    // Having Thread Local will allow support for Multi Threaded Test Cases
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    // Can be made Configurable via props file
    static String browserName="chrome";

    // Configurable via props file
    static String driverpath="src/main/resources/drivers/mac/chrome/chromedriver";

    @Before
    public static void setDriver() {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", driverpath);
            System.setProperty("webdriver.http.factory", "jdk-http-client");
            driver.set(new ChromeDriver());
        }
    }
    public static WebDriver getDriver() {
        return driver.get();
    }

    @After
    public void tearDown(){
        getDriver().close();
    }
}
