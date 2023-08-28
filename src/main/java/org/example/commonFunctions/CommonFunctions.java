package org.example.commonFunctions;

import org.example.pages.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonFunctions {
    public static void navigateToPage() {
        try {
            Base.getDriver().get("https://www.google.com/");
            Base.getDriver().manage().window().maximize();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void waitForElement(By locator, long waitSeconds) {
            WebDriverWait wait = new WebDriverWait(Base.getDriver(), Duration.ofSeconds(waitSeconds));
             wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForElement(WebElement element, long waitSeconds) {
        WebDriverWait wait = new WebDriverWait(Base.getDriver(), Duration.ofSeconds(waitSeconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}