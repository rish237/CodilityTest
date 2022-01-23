package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.AllBattlefieldPageObjects;
import testData.pagesData.AllBattlefieldPageData;
import utils.ElementUtility;
import utils.GlobalUtility;

public class AllBattlefieldPage
{

    public void verifyAllBattlefieldHomePage(WebDriver driver)
    {
        ElementUtility.waitForElementToBeVisible(AllBattlefieldPageObjects.noSecondChancesText, 10, driver);
        WebElement welcomeText = ElementUtility.fetchElement(AllBattlefieldPageObjects.noSecondChancesText,driver);

        GlobalUtility.printActualExpectedValues(AllBattlefieldPageData.noChancesText,welcomeText.getText());
        Assert.assertEquals(AllBattlefieldPageData.noChancesText, welcomeText.getText());

        ElementUtility.waitForElementToBeClickable(AllBattlefieldPageObjects.startButton, 10, driver);

        ElementUtility.fetchElement(AllBattlefieldPageObjects.startButton,driver).click();

        ElementUtility.waitForElementToBeVisible(AllBattlefieldPageObjects.continueReadingAnswer, 10, driver);


    }
    public void completeAllBattlefieldChallenges(WebDriver driver)
    {
        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.continueReadingAnswer,10,driver);

        ElementUtility.waitForElementToBeVisible(AllBattlefieldPageObjects.correctText, 10, driver);
        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.continueButton,10,driver);

        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.personalProtectiveAnswer,10,driver);

        ElementUtility.waitForElementToBeVisible(AllBattlefieldPageObjects.correctText, 10, driver);
        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.continueButton,10,driver);

        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.sanitizerAnswer,10,driver);

        ElementUtility.waitForElementToBeVisible(AllBattlefieldPageObjects.correctText, 10, driver);
        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.continueButton,10,driver);

        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.socialDistancingAnswer,10,driver);

        ElementUtility.waitForElementToBeVisible(AllBattlefieldPageObjects.correctText, 10, driver);
        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.continueButton,10,driver);

        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.socialDistanceAnswer,10,driver);

        ElementUtility.waitForElementToBeVisible(AllBattlefieldPageObjects.correctText, 10, driver);
        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.continueButton,10,driver);

        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.anotherSeatAnswer,10,driver);

        ElementUtility.waitForElementToBeVisible(AllBattlefieldPageObjects.correctText, 10, driver);
        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.continueButton,10,driver);

        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.innerElbowAnswer,10,driver);

        ElementUtility.waitForElementToBeVisible(AllBattlefieldPageObjects.correctText, 10, driver);
        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.continueButton,10,driver);

        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.possibleContaminationAnswer,10,driver);

        ElementUtility.waitForElementToBeVisible(AllBattlefieldPageObjects.correctText, 10, driver);
        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.continueButton,10,driver);

        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.reasonableLogicAnswer,10,driver);

        ElementUtility.waitForElementToBeVisible(AllBattlefieldPageObjects.correctText, 10, driver);
        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.continueButton,10,driver);

        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.iKnowAnswer,10,driver);

        ElementUtility.waitForElementToBeVisible(AllBattlefieldPageObjects.correctText, 10, driver);
        ElementUtility.verifyVisibilityAndClickButton(AllBattlefieldPageObjects.continueButton,10,driver);
    }




}
