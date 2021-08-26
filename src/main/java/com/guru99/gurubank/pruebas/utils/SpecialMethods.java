package com.guru99.gurubank.pruebas.utils;

import net.thucydides.core.webdriver.capabilities.SaucelabsRemoteDriverCapabilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class SpecialMethods {

    public static void clickJS(WebDriver driver, By by){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", driver.findElement(by));
    }


    public static void write(WebDriver driver, By by, String string){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(by).sendKeys(string);
    }

    public static void validateText(WebDriver driver, By by, String expectedText){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        assertEquals(driver.findElement(by).getText(), expectedText);
    }


    public static void waitFor(int millis) throws InterruptedException{
        Thread.sleep(millis);
    }
}
