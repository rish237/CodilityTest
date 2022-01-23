package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.OfficePageObjects;
import testData.pagesData.OfficePageData;
import utils.ElementUtility;
import utils.GlobalUtility;

public class OfficePage
{

    public void verifyAndEnterOfficePage(WebDriver driver)
    {
        ElementUtility.waitForElementToBeVisible(OfficePageObjects.welcomeText, 20, driver);
        WebElement welcomeText = ElementUtility.fetchElement(OfficePageObjects.welcomeText,driver);

        GlobalUtility.printActualExpectedValues(OfficePageData.welcomeText,welcomeText.getText());
        Assert.assertEquals(OfficePageData.welcomeText, welcomeText.getText());

        ElementUtility.waitForElementToBeClickable(OfficePageObjects.startButton, 20, driver);
        ElementUtility.fetchElement(OfficePageObjects.startButton,driver).click();



    }

    public void completeAnswerAndCheckLeaderBoard(WebDriver driver)
    {
        ElementUtility.waitForElementToBeClickable(OfficePageObjects.SocialDistanceAnswer, 20, driver);
        ElementUtility.fetchElement(OfficePageObjects.SocialDistanceAnswer,driver).click();

        ElementUtility.waitForElementToBeVisible(OfficePageObjects.correctText, 20, driver);
        WebElement correctText = ElementUtility.fetchElement(OfficePageObjects.correctText,driver);

        GlobalUtility.printActualExpectedValues(OfficePageData.correctText,correctText.getText());
        Assert.assertEquals(OfficePageData.correctText, correctText.getText());

        ElementUtility.waitForElementToBeClickable(OfficePageObjects.leaderBoardLink, 20, driver);
        ElementUtility.fetchElement(OfficePageObjects.leaderBoardLink,driver).click();


    }
}
