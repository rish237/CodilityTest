package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.CreateWarriorPageObjects;
import testData.pagesData.WarriorPageData;
import utils.ElementUtility;
import utils.GlobalUtility;

public class CreateWarriorPage
{


    public void verifyWarriorPage(WebDriver driver)  {


        WebElement elemDesc = ElementUtility.fetchElement(CreateWarriorPageObjects.gameDescription,driver);
        WebElement elemQuestion=  ElementUtility.fetchElement(CreateWarriorPageObjects.warriorNameQuestion, driver);

        ElementUtility.waitForElementToBeVisible(CreateWarriorPageObjects.gameDescription, 20, driver);

        GlobalUtility.printActualExpectedValues(WarriorPageData.gameDescription,elemDesc.getText());
        Assert.assertEquals(WarriorPageData.gameDescription, elemDesc.getText());
        GlobalUtility.printActualExpectedValues(WarriorPageData.warriorNameQuestion,elemQuestion.getText());
        Assert.assertEquals(WarriorPageData.warriorNameQuestion, elemQuestion.getText());
    }


    public void enterUserNameAndLogin(String name , WebDriver driver)
    {
        WebElement usernameField = ElementUtility.fetchElement(CreateWarriorPageObjects.warriarUserName,driver);
        WebElement createWarriorButton = ElementUtility.fetchElement(CreateWarriorPageObjects.createWarriorButton,driver);
        WebElement startJourneyButton = ElementUtility.fetchElement(CreateWarriorPageObjects.startJourneyButton,driver);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",usernameField );

        usernameField.sendKeys(name);

        ElementUtility.waitForElementToBeVisible(CreateWarriorPageObjects.createWarriorButton, 20, driver);

        createWarriorButton.click();

        ElementUtility.waitForElementToBeVisible(CreateWarriorPageObjects.startJourneyButton, 20, driver);

        startJourneyButton.click();


    }




}
