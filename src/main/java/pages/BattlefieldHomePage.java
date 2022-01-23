package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.BattlefieldHomePageObjects;
import testData.pagesData.BattlefieldHomePageData;
import utils.ElementUtility;
import utils.GlobalUtility;

public class BattlefieldHomePage
{

    public void verifyBattlefieldHomePage(String userName,WebDriver driver)
    {
        ElementUtility.waitForElementToBeVisible(BattlefieldHomePageObjects.welcomeText, 20, driver);
        WebElement welcomeText = ElementUtility.fetchElement(BattlefieldHomePageObjects.welcomeText,driver);

        GlobalUtility.printActualExpectedValues(BattlefieldHomePageData.welcomeText+" "+userName,welcomeText.getText());
        Assert.assertEquals(BattlefieldHomePageData.welcomeText+" "+userName
                , welcomeText.getText());

        ElementUtility.waitForElementToBeClickable(BattlefieldHomePageObjects.allBattlefieldsButton,20, driver);

        WebElement allBattlefieldsButtonText = ElementUtility.fetchElement(BattlefieldHomePageObjects.allBattlefieldsButton,driver);
        GlobalUtility.printActualExpectedValues(BattlefieldHomePageData.allBattlefieldButtonText,allBattlefieldsButtonText.getText());
        Assert.assertEquals(BattlefieldHomePageData.allBattlefieldButtonText, allBattlefieldsButtonText.getText());

    }

    public void enterAllBattlefields(WebDriver driver)
    {
        WebElement allBattlefieldElement = ElementUtility.fetchElement(BattlefieldHomePageObjects.allBattlefieldsButton,driver);
        allBattlefieldElement.click();
    }

    public void enterOfficePage(WebDriver driver)
    {
        WebElement officeButtonElement = ElementUtility.fetchElement(BattlefieldHomePageObjects.officeButton,driver);
        officeButtonElement.click();
    }
}
