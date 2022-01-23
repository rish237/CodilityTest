package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ElementUtility
{

    public static WebElement fetchElement(By by, WebDriver driver) {
        return driver.findElement(by);
    }

    public static List<WebElement> fetchElements(By by, WebDriver driver) {
        return driver.findElements(by);
    }

    public static WebElement waitForElementToBeClickable(By byElement, int timeOut, WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        return wait.until(ExpectedConditions.elementToBeClickable(byElement));
    }

    public static WebElement waitForElementToBeVisible(By byElement,int timeOut,WebDriver driver)
    {
        WebDriverWait wait=new WebDriverWait(driver, timeOut);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(byElement));
    }

    public static void verifyVisibilityAndClickButton(By byElement,int timeOut,WebDriver driver)
    {
        waitForElementToBeClickable(byElement, timeOut, driver);
        fetchElement(byElement,driver).click();
    }



}
