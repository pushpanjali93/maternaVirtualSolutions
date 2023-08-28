package org.example.pages;

import org.example.locators.Locators;
import org.example.commonFunctions.CommonFunctions;
import org.junit.Assert;
import org.openqa.selenium.*;

import java.time.LocalDate;
import java.util.List;


public class SearchPage {
    public static void deleteCookies() {
        WebDriver driver = Base.getDriver();
        driver.manage().deleteCookieNamed("CONSENT");
        driver.manage().addCookie(new Cookie("CONSENT", "YES+shp.gws-" + LocalDate.now().toString().replace("-", "") + "-0-RC2.en+FX+374"));
        driver.navigate().refresh();
    }

    public static void search(String keyword) {
        WebDriver driver = Base.getDriver();
        CommonFunctions.waitForElement(Locators.searchName,30);
        WebElement search = driver.findElement(Locators.searchName);
        search.sendKeys(keyword);
        search.sendKeys(Keys.RETURN);
    }

    public static void clickOnSearchResults(int position) {
        WebDriver driver = Base.getDriver();
      CommonFunctions.waitForElement(Locators.searchList,30);
        List<WebElement> searchLists = driver.findElements(Locators.searchList);
        WebElement searchLink = searchLists.get(position).findElement(Locators.searchLink);
        JavascriptExecutor ex = (JavascriptExecutor) driver;
        ex.executeScript("arguments[0].click();", searchLink);
    }

    public static void verifyPageTitle() {
        String title = Base.getDriver().getTitle();
        Assert.assertEquals("Active sync - Google Search", title);
    }
}
