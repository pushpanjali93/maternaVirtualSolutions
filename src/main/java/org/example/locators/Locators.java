package org.example.locators;

import org.openqa.selenium.By;

public class Locators {

    public static By searchName = By.xpath("//textarea[@name='q']");
    public static By searchList = By.xpath("//*[@id='search']/div[1]/div/div/div");
    public static By searchLink = By.xpath(".//a");

}
